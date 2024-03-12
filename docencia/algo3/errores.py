import yaml

with open("errores-r1.yaml", "r") as stream:
    errores = yaml.safe_load(stream) 


def errores_de(numero_de_orden):
    res = {}
    for ejercicio, incisos in errores.items():
        for inciso, errores_de_inciso in incisos.items():
            for error, numeros_de_orden in errores_de_inciso.items():
                if numero_de_orden in numeros_de_orden:
                    res.setdefault(ejercicio, {})
                    res[ejercicio].setdefault(inciso, [])
                    res[ejercicio][inciso].append(error)
    return res


print(errores_de(31))
    