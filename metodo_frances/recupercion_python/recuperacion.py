import pygame
import math
import random
import sys
import tkinter as tk
from tkinter import simpledialog

# Inicializar Pygame y Tkinter
pygame.init()
raiz_tk = tk.Tk()
raiz_tk.withdraw()

# Constantes
ANCHO, ALTO = 800, 600
TAM_TANQUE = 60
TAM_OBJETIVO = 50
RECT_BOTON = pygame.Rect(400, ALTO - 60, 150, 40)
BOTON_REINICIAR = pygame.Rect(ANCHO // 2 - 110, ALTO // 2 + 40, 100, 40)
BOTON_SALIR = pygame.Rect(ANCHO // 2 + 10, ALTO // 2 + 40, 100, 40)
FUENTE = pygame.font.SysFont("arial", 20)
BLANCO = (255, 255, 255)
AZUL = (0, 100, 255)
GRIS = (220, 220, 220)
NEGRO = (0, 0, 0)

# Crear ventana
pantalla = pygame.display.set_mode((ANCHO, ALTO))
pygame.display.set_caption("Juego")
reloj = pygame.time.Clock()

# Cargar imágenes
try:
    imagen_tanque = pygame.image.load(
        r"C:\Users\USUARIO\Documents\Proyectos\metodo_frances\recupercion_python\imagenes\tanque.png"
    ).convert_alpha()
    imagen_tanque = pygame.transform.scale(imagen_tanque, (TAM_TANQUE, TAM_TANQUE))

    imagen_objetivo = pygame.image.load(
        r"C:\Users\USUARIO\Documents\Proyectos\metodo_frances\recupercion_python\imagenes\nave.png"
    ).convert_alpha()
    imagen_objetivo = pygame.transform.scale(imagen_objetivo, (TAM_OBJETIVO, TAM_OBJETIVO))
except Exception as e:
    print("Error al cargar imágenes:", e)
    pygame.quit()
    sys.exit()

# Posiciones iniciales
pos_tanque = (TAM_TANQUE // 2, ALTO - TAM_TANQUE // 2)
pos_objetivo = [random.randint(100, ANCHO - 100), random.randint(50, ALTO - 200)]
ultimo_angulo = None
ganador = False

# Verifica impacto
def hay_impacto(angulo):
    radianes = math.radians(angulo)
    x, y = pos_tanque
    for i in range(0, 1000, 5):
        dx = int(x + i * math.cos(radianes))
        dy = int(y - i * math.sin(radianes))
        if 0 <= dx <= ANCHO and 0 <= dy <= ALTO:
            if (pos_objetivo[0] - TAM_OBJETIVO // 2 <= dx <= pos_objetivo[0] + TAM_OBJETIVO // 2 and
                pos_objetivo[1] - TAM_OBJETIVO // 2 <= dy <= pos_objetivo[1] + TAM_OBJETIVO // 2):
                return True
        else:
            break
    return False

# Dibujar juego
def dibujar_juego(ultimo_angulo):
    pantalla.fill(GRIS)

    # Tanque
    pos_dibujo_tanque = (pos_tanque[0] - TAM_TANQUE // 2, pos_tanque[1] - TAM_TANQUE // 2)
    pantalla.blit(imagen_tanque, pos_dibujo_tanque)

    # Objetivo
    pos_dibujo_objetivo = (pos_objetivo[0] - TAM_OBJETIVO // 2, pos_objetivo[1] - TAM_OBJETIVO // 2)
    pantalla.blit(imagen_objetivo, pos_dibujo_objetivo)

    # Botón de disparo
    if not ganador:
        pygame.draw.rect(pantalla, AZUL, RECT_BOTON)
        texto = FUENTE.render("Ingresar ángulo", True, BLANCO)
        pantalla.blit(texto, (RECT_BOTON.x + 10, RECT_BOTON.y + 10))

    # Línea de disparo
    if ultimo_angulo is not None:
        radianes = math.radians(ultimo_angulo)
        inicio_x, inicio_y = pos_tanque
        fin_x = int(inicio_x + 1000 * math.cos(radianes))
        fin_y = int(inicio_y - 1000 * math.sin(radianes))
        pygame.draw.line(pantalla, NEGRO, pos_tanque, (fin_x, fin_y), 2)

    # Mensaje de victoria y botones
    if ganador:
        texto_victoria = FUENTE.render("¡Objetivo alcanzado!", True, (0, 128, 255))
        pantalla.blit(texto_victoria, (ANCHO // 2 - 100, ALTO // 2))

        pygame.draw.rect(pantalla, (0, 200, 0), BOTON_REINICIAR)
        texto_reiniciar = FUENTE.render("Reiniciar", True, BLANCO)
        pantalla.blit(texto_reiniciar, (BOTON_REINICIAR.x + 10, BOTON_REINICIAR.y + 10))

        pygame.draw.rect(pantalla, (200, 0, 0), BOTON_SALIR)
        texto_salir = FUENTE.render("Salir", True, BLANCO)
        pantalla.blit(texto_salir, (BOTON_SALIR.x + 25, BOTON_SALIR.y + 10))

    pygame.display.flip()

# Bucle principal
ejecutando = True
while ejecutando:
    dibujar_juego(ultimo_angulo)
    for evento in pygame.event.get():
        if evento.type == pygame.QUIT:
            ejecutando = False

        elif evento.type == pygame.MOUSEBUTTONDOWN and evento.button == 1:
            if ganador:
                # Menú de victoria
                if BOTON_REINICIAR.collidepoint(evento.pos):
                    pos_objetivo = [random.randint(100, ANCHO - 100), random.randint(50, ALTO - 200)]
                    ultimo_angulo = None
                    ganador = False
                elif BOTON_SALIR.collidepoint(evento.pos):
                    ejecutando = False
            else:
                if RECT_BOTON.collidepoint(evento.pos):
                    try:
                        entrada = simpledialog.askstring("Ángulo de disparo", "Ingresa ángulo (0° a 180°):")
                        if entrada is None:
                            continue
                        angulo = float(entrada)
                        if 0 <= angulo <= 180:
                            ultimo_angulo = angulo
                            if hay_impacto(angulo):
                                ganador = True
                            else:
                                pos_objetivo = [random.randint(100, ANCHO - 100), random.randint(50, ALTO - 200)]
                        else:
                            print("Ángulo fuera de rango.")
                    except Exception as e:
                        print("Entrada inválida:", e)

    reloj.tick(30)

pygame.quit()
sys.exit()
