from simulacion import simular

GUSTOS = [
    [[1,1,1,1]] * 2,
    [[1,1,1,1], [2,2,2,2]],
    [[1,2,3,4]] * 2,
    [[1,2,3,5]] * 2,
    [[1,2,3,100]] * 2,
    [[0,0,0,1]] * 2,
    [[0,0,1,1], [0,0,0,1]],
    [[0,1,1,1], [0,0,0,1]],
    [[1,1,1,1], [0,0,0,1]],
    [[1,1,1,0], [0,0,0,1]],
    [[1,1,0,0], [0,0,0,1]],
    [[1,0,0,0], [0,0,0,1]],
    [[1,0,0,0], [0,0,1,1]],
    [[1,0,0,0], [0,1,1,1]],
    [[1,0,0,0], [1,1,1,1]],
    [[1,0,0,0], [1,1,1,0]],
    [[1,0,0,0], [1,1,0,0]],
]

def generar_tabla():
    for gustos_1, gustos_2 in GUSTOS:
        valoracion_1, valoracion_2 = simular(gustos_1, gustos_2)
        print(f"|{gustos_1}|{gustos_2}|{round(valoracion_1, 3)}|{round(valoracion_2, 3)}|".replace(".", ","))
        

if __name__ == "__main__":
    generar_tabla()