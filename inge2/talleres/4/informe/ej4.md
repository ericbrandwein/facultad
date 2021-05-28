## Ejercicio 4
### a.
El árbol de cómputo de la función `triangle` es el siguiente:

![](informe/diagrama-ej4.png){ width=40% }



### b.
Randoop generó 67 tests en 2 segundos, los cuales fueron más que suficientes para cubrir todas las líneas del método triangle. Esto podría deberse a que es un método pequeño con branches que son tomadas en muchos posibles casos, y Randoop tuvo la suerte de elegir bien los casos de test.

Para hacer una comparación entre Randoop y DSE, podríamos decir que Randoop probablemente produzca casos de test más rápidamente que DSE, por el hecho de que DSE necesita un demostrador de teoremas para funcionar. Por otro lado, cada caso que produzca DSE analizará un branch diferente del programa, y por lo tanto cada caso será más significativo y el testsuite será más reducido.

### c.
Pondremos nombres a las condiciones de los `if` que componen el método `triangle` para lograr mayor síntesis.
```
alguno_no_positivo := a0 <= 0 || b0 <= 0 || c0 <= 0
lado_muy_largo := !(a0 + b0 > c0 && a0 + c0 > b0 && b0 + c0 > a0)
equilátero := a0 == b0 && b0 == c0
isósceles := a0 == b0 || b0 == c0 || a0 == c0
```

En vez de hacer una tabla, muestro las iteraciones en una lista, porque las especificaciones para Z3 llegan a ser muy largas y no entrarían en una celda.

### Iteraciones:

#### 1.
- **Input concreto:** `a=0`, `b=0`, `c=0`
- **Condición de Ruta:** `alguno_no_positivo`
- **Especificación para Z3:**
```
    (assert (not (or (or (<= a0 0) (<= b0 0)) (<= c0 0))))
```
- **Resultado Z3:** `a0=1`, `b0=1`, `c0=1`

#### 2.
- **Input concreto:** `a=1`, `b=1`, `c=1`
- **Condición de Ruta:** `!alguno_no_positivo && !lado_muy_largo && equilátero`
- **Especificación para Z3:**
```
    (assert (not (or (or (<= a0 0) (<= b0 0)) (<= c0 0))))
    (assert (and (and (> (+ a0 b0) c0) (> (+ a0 c0) b0)) (> (+ b0 c0) a0)))
    (assert (not (and (= a0 b0) (= b c0))))
```
- **Resultado Z3:** `a0=2`, `b0=3`, `c0=4`

#### 3.
- **Input concreto:** `a=2`, `b=3`, `c=4`
- **Condición de Ruta:** `!alguno_no_positivo && !lado_muy_largo && !equilátero && !isósceles`
- **Especificación para Z3:**
```
    (assert (not (or (or (<= a0 0) (<= b0 0)) (<= c0 0))))
    (assert (and (and (> (+ a0 b0) c0) (> (+ a0 c0) b0)) (> (+ b0 c0) a0)))
    (assert (not (and (= a0 b0) (= b0 c0))))
    (assert (or (or (= a0 b0) (= b0 c0)) (= a0 c0)))
```
- **Resultado Z3:** `a0=2`, `b0=1`, `c0=2`

#### 4.
- **Input concreto:** `a=2`, `b=1`, `c=2`
- **Condición de Ruta:** `!alguno_no_positivo && !lado_muy_largo && !equilátero && isósceles`
- **Especificación para Z3:**
```
    (assert (not (or (or (<= a0 0) (<= b0 0)) (<= c0 0))))
    (assert (not (and (and (> (+ a0 b0) c0) (> (+ a0 c0) b0)) (> (+ b0 c0) a0))))
```
- **Resultado Z3:** `a0=1`, `b0=1`, `c0=2`

#### 5.
- **Input concreto:** `a=1`, `b=1`, `c=2`
- **Condición de Ruta:** `!alguno_no_positivo && lado_muy_largo`
- **Especificación para Z3:** Ninguna
- **Resultado Z3:** Ninguno


### d.
Este test suite alcanzará un line coverage del 100%, ya que en ningún momento hubo un resultado `unsat` o `unknown` de parte de Z3, lo cual garantiza que, como el algoritmo finalizó, cubrió todas las ramas del árbol de cómputo.
