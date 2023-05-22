#!/usr/bin/env python3
import numpy as np
import sys

VERDE = "\033[92m"
ROJO = "\033[91m"
NORMAL = "\033[0m"
BOLD = "\033[1m"

LOGGING = True

def valoracion(porcion, gustos):
    return sum(gustos[i] for i in porcion)


def cortar(torta, corte):
    return torta[:corte], torta[corte:]


def valoraciones_corte(torta, corte, gustos_1, gustos_2):
    porciones = cortar(torta, corte)
    valoraciones_2 = [valoracion(porcion, gustos_2) for porcion in porciones]
    valoracion_2 = max(valoraciones_2)
    porcion_elegida_2 = valoraciones_2.index(valoracion_2)
    porcion_elegida_1 = porciones[1 - porcion_elegida_2]
    valoracion_1 = valoracion(porcion_elegida_1, gustos_1)
    return valoracion_1, valoracion_2


def mejor_corte(torta, gustos_1, gustos_2):
    max_corte = 0
    max_valoracion_1 = 0
    max_valoracion_2 = 0
    for corte in range(1, len(torta)):
        valoracion_1, valoracion_2 = valoraciones_corte(torta, corte, gustos_1, gustos_2)
        if valoracion_1 > max_valoracion_1:
            max_corte = corte
            max_valoracion_1 = valoracion_1
            max_valoracion_2 = valoracion_2
            
    return max_corte, max_valoracion_1, max_valoracion_2


def normalizar_valoracion(torta, gustos, valor):
    max_valoracion = valoracion(torta, gustos)
    if max_valoracion == 0:
        return 0
    return valor / valoracion(torta, gustos)


def torta_aleatoria(tamanio):
    return np.random.randint(4, size=tamanio)


def loguear_ronda(torta, corte, valoracion_1, valoracion_2):
    torta_strings = [str(porcion + 1) for porcion in torta]
    torta_string = "".join(torta_strings[:corte] + [f"{ROJO}|{NORMAL}"] + torta_strings[corte:])
    if LOGGING:
        print(f"{VERDE}Torta:{NORMAL}", torta_string)
        print(f"{VERDE}Valoraciones:{NORMAL}", round(valoracion_1, 3), round(valoracion_2, 3))
        print()


def ronda_simulacion(gustos_1, gustos_2, tamanio_torta=1000):
    torta = torta_aleatoria(tamanio_torta)
    corte, valoracion_1, valoracion_2 = mejor_corte(torta, gustos_1, gustos_2)
    valoracion_1 = normalizar_valoracion(torta, gustos_1, valoracion_1)
    valoracion_2 = normalizar_valoracion(torta, gustos_2, valoracion_2)
    loguear_ronda(torta, corte, valoracion_1, valoracion_2)
    return valoracion_1, valoracion_2


def simular(gustos_1, gustos_2, n_simulaciones=100, tamanio_torta=10):
    np.random.seed(42)
    resultados = [
        ronda_simulacion(gustos_1, gustos_2, tamanio_torta) for _ in range(n_simulaciones)
    ]
    return np.sum(resultados, axis=0)


def formatted_string_to_int_list(string):
    return list(map(int, string.strip('[] ').replace(' ','').split(',')))


def main():
    gustos_1 = formatted_string_to_int_list(sys.argv[1])
    gustos_2 = formatted_string_to_int_list(sys.argv[2])
    valoraciones = simular(gustos_1, gustos_2)
    print(f"{BOLD}{VERDE}Total:{NORMAL}{BOLD} {valoraciones}{NORMAL}")

if __name__ == "__main__":
    main()
    