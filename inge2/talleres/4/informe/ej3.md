## Ejercicio 3
Una posible especificación para Z3 que calcule las expresiones pedidas sería:
```
(declare-const a1 Int)
(declare-const a2 Int)
(declare-const a3 Int)
(assert (= a1 (mod 16 2)))
(assert (= a2 (div 16 4)))
(assert (= a3 (rem 16 5)))
(check-sat)
(get-model)
```

La salida de Z3 con esta especificación fue:
```
sat
(model
  (define-fun a3 () Int
    1)
  (define-fun a2 () Int
    4)
  (define-fun a1 () Int
    0)
)
```

, es decir que un modelo que verifica las fórmulas es con `a1 = 0, a2 = 4, y a3 = 1`.
