## Ejercicio 5
### a.
El árbol de cómputo de la función `magicFunction` es el siguiente:

![](informe/diagrama-ej5.png)


### b.
De nuevo, la cobertura fue del 100%. Esto nos está indicando que Randoop es bastante bueno para generar tests, por lo menos para estas funciones pequeñas.

### c.
Vamos a llamar `Q(i)` a la condición `array[i] + k0 == 0`.

#### Iteraciones:

#### 1.
- **Input Concreto:** `k=0.0`
- **Condición de Ruta:** `!Q(0) && !Q(1) && !Q(2)`
- **Especificación para Z3:**
```
    (assert (not (= (+ 5.0 k0) 0)))
    (assert (not (= (+ 1.0 k0) 0)))
    (assert (= (+ 3.0 k0) 0))
```
- **Resultado Z3:** `k0=-3.0`

#### 2.
- **Input Concreto:** `k=-3.0`
- **Condición de Ruta:** `!Q(0) && !Q(1) && Q(2)`
- **Especificación para Z3:**
```
    (assert (not (= (+ 5.0 k0) 0)))
    (assert (= (+ 1.0 k0) 0))
```
- **Resultado Z3:** `k0=-1.0`

#### 3.
- **Input Concreto:** `k=-1.0`
- **Condición de Ruta:** `!Q(0) && Q(1) && !Q(2)`
- **Especificación para Z3:**
```
    (assert (not (= (+ 5.0 k0) 0)))
    (assert (= (+ 1.0 k0) 0))
    (assert (= (+ 3.0 k0) 0))
```
- **Resultado Z3:** `unsat`

- **Especificación para Z3:**
```
    (assert (= (+ 5.0 k0) 0))
    (assert (not (= (+ 1.0 k0) 0)))
    (assert (not (= (+ 3.0 k0) 0)))
```
- **Resultado Z3:** `k0=-5.0`

#### 4.
- **Input Concreto:** `k=-5.0`
- **Condición de Ruta:** `Q(0) && !Q(1) && !Q(2)`
- **Especificación para Z3:**
```
    (assert (= (+ 5.0 k0) 0))
    (assert (not (= (+ 1.0 k0) 0)))
    (assert (= (+ 3.0 k0) 0))
```
- **Resultado Z3:** `unsat`

- **Especificación para Z3:**
```
    (assert (= (+ 5.0 k0) 0))
    (assert (= (+ 1.0 k0) 0))
```
- **Resultado Z3:** `unsat`


### d.
El line coverage es de nuevo 100%. En este caso, para tener un line coverage de 100% sólo es necesario que haya por lo menos un test para el cual la condición del `if` sea verdadera, lo cual se cumple con el test generado en la segunda iteración.
