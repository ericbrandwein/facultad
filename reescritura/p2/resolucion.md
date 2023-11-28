# Ejercicio 1
### a) Existe un término $t \in \Lambda$ tal que para todo $s \in \Lambda$ se tiene que $t\ s =_\beta s\ t$.

**Falso**. Supongamos que sí existe tal $t$. Entonces tiene una de estas formas: $$t = x\ |\ t' t''\ |\ (\lambda x. t').$$

Para cada caso, encontraremos un $s$ que no cumple la propiedad.

- $t = x$: Tomamos $s=(\lambda y. (\lambda z.z))$. Entonces $t\ s \rightarrow_\beta x$ y $s\ t =_\beta (\lambda y. (\lambda z.z))\ x =_\beta (\lambda z.z)$, que no son iguales.