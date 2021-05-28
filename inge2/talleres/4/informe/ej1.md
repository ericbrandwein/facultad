## Ejercicio 1

### a.
```
(declare-const x Bool)
(declare-const y Bool)
(assert (= (not (or x y)) (and (not x) (not y))))
(check-sat)
(get-model)
```

Z3 devolvió `sat`, sin mostrar ningún modelo.

### b.
```
(declare-const x Bool)
(declare-const y Bool)
(assert (= (and x y) (not (or (not x) (not y)))))
(check-sat)
(get-model)
```

Z3 devolvió `sat`, sin mostrar ningún modelo.

### c.
```
(declare-const x Bool)
(declare-const y Bool)
(assert (= (not (and x y)) (not (and (not x) (not y)))))
(check-sat)
(get-model)
```

Z3 devolvió `sat`, con modelo `y = true, x = false`.
