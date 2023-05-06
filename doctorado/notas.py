notas_cbc = [10, 7, 7, 7, 8, 7]
notas_carrera = [10, 7, 8, 4, 6, 9, 10, 7, 10, 10, 10, 9, 10, 8, 10, 9, 9, 10, 10, 10, 10, 10]
notas = notas_cbc + notas_carrera

def promedio(notas):
    return sum(notas)/len(notas)

print('Promedio total: ', promedio(notas))
print('Promedio sin CBC: ', promedio(notas_carrera))