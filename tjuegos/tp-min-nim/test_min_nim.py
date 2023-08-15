from min_nim import calcular_posiciones

def test01():
    posiciones, _ = calcular_posiciones([1,2,3], [4,4,4])
    assert posiciones == {(0, 0, 0): False, (0, 0, 1): False, (0, 0, 2): False, (0, 0, 3): False, (0, 1, 0): False, (0, 1, 1): False, (0, 1, 2): False, (0, 1, 3): False, (0, 2, 0): False, (0, 2, 1): False, (0, 2, 2): False, (0, 2, 3): False, (1, 0, 0): False, (1, 0, 1): False, (1, 0, 2): False, (1, 0, 3): False, (1, 1, 0): False, (1, 1, 1): False, (1, 1, 2): False, (1, 1, 3): False, (1, 2, 0): False, (1, 2, 1): False, (1, 2, 2): False, (1, 2, 3): False}


def test02():
    posiciones, _ = calcular_posiciones([0,0,1], [1,2,3])
    assert posiciones == {(0, 0, 0): False, (0, 0, 1): True}


def test03():
    posiciones, _ = calcular_posiciones([0,1,1], [1,2,3])
    assert posiciones == {(0, 0, 0): False, (0, 0, 1): True, (0, 1, 0): True, (0, 1, 1): False}