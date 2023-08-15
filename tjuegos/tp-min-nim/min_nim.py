from pprint import pprint
from sys import argv

def triplas(elementos):
    for x in range(elementos[0] + 1):
        for y in range(elementos[1] + 1):
            for z in range(elementos[2] + 1):
                yield x, y, z


def jugadas_posibles(elementos, opciones):
    for opcion in opciones:
        for pila in range(len(elementos)):
            if elementos[pila] >= opcion:
                nueva_posicion = list(elementos)
                nueva_posicion[pila] -= opcion
                nueva_posicion = tuple(nueva_posicion)
                yield nueva_posicion


def calcular_posiciones(elementos, opciones):
    """Calcula las P- y N-posiciones para el juego de pilas con `elementos` elementos 
    en el que se pueden sacar `opciones` elementos a la vez.
    
    Complejidad temporal: O(product(elementos))
    """

    assert elementos == sorted(elementos)
    assert opciones == sorted(opciones)

    min_opcion = opciones[0]
    posiciones = dict()
    distancias = dict()

    for posicion in triplas(elementos):
        jugadas = list(jugadas_posibles(posicion, opciones))
        es_posicion_ganadora = any(not posiciones[jugada] for jugada in jugadas)
        es_terminal = all(largo_pila < min_opcion for largo_pila in posicion)
        if es_terminal:
            distancia = 0
        elif es_posicion_ganadora:
            distancia = min(
                distancias[jugada] for jugada in jugadas if not posiciones[jugada]
            ) + 1
        else:
            distancia = max(distancias[jugada] for jugada in jugadas) + 1
        posiciones[posicion] = es_posicion_ganadora
        distancias[posicion] = distancia

    return posiciones, distancias


def jugada_optima(elementos, opciones):
    """Calcula una jugada optima para el primer jugador"""
    posiciones, distancias = calcular_posiciones(elementos, opciones)
    assert distancias[elementos] > 0, "No se puede calcular la jugada óptima en una posición terminal"
    jugadas = list(jugadas_posibles(elementos, opciones))
    posicion_optima = jugadas[0]
    for jugada in jugadas:
        if not posiciones[jugada]:
            # Es una jugada ganadora para el primer jugador
            return jugada
        if distancias[posicion_optima] < distancias[jugada]:
            posicion_optima = jugada
            
    return posicion_optima


def cast_all_to_int(elements):
    return list(map(int, elements))


if __name__ == '__main__':
    elementos = cast_all_to_int(argv[1:4])
    opciones = cast_all_to_int(argv[4:])
    pprint(calcular_posiciones(elementos, opciones)[0])