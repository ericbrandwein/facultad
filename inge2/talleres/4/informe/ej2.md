## Ejercicio 2

### a. 3x + 2y = 36
```
(declare-const x Int)
(declare-const y Int)
(assert (= (+ (* 3 x) (* 2 y)) 36))
(check-sat)
(get-model)
```

El resultado fue `sat`, y el modelo fue `y = 0, x = 12`.

### b. 5x + 4y = 64
```
(declare-const x Int)
(declare-const y Int)
(assert (= (+ (* 5 x) (* 4 y)) 64))
(check-sat)
(get-model)
```

El resultado fue `sat`, y el modelo fue `y = 1, x = 12`.

### c. x * y = 64
```
(declare-const x Int)
(declare-const y Int)
(assert (= (* x y) 64))
(check-sat)
(get-model)
```

El resultado fue `sat`, y el modelo fue `y = 1, x = 64`.
