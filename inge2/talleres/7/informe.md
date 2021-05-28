# Ejercicio 1

## a)

```
[]<>((!enBase) ^ X enBase)
```
Es una propiedad de liveness.

## b)

```
[](bateriaBaja -> (X modoAhorro U enBase))
```
Es una propiedad de safety.

## c)

```
[](!(girandoAIzquierda ^ girandoADerecha))
```
Es una propiedad de safety.

## d)

```
[](detectaPared -> (girandoAIzquierda U !detectaPared))
```
Es una propiedad de safety.

# Ejercicio 2

En este ejercicio voy a notar las proposiciones válidas $p_i$ en un mundo como $\{p_0,p_1, \dots\}$.

## a)
No son equivalentes. La traza "$\{p\}\rightarrow\{q\}\rightarrow\{p\}\rightarrow\{q\}\rightarrow\dots$" cumple la segunda pero no la primera.

## b)

$$
\begin{aligned}
    \sigma[i] \models [](p \land q)
    & \Longleftrightarrow (\forall j \geq i)\ \sigma[j] \models (p \land q) \\
    & \Longleftrightarrow (\forall j \geq i)\ ((\sigma[j] \models p) \land (\sigma[j] \models q)) \\
    & \Longleftrightarrow (\forall j \geq i)\ (\sigma[j] \models p) \land (\forall j \geq i)\ (\sigma[j] \models q) \\
    & \Longleftrightarrow (\sigma[i] \models []p) \land (\sigma[i] \models []q) \\
    & \Longleftrightarrow \sigma[i] \models ([]p \land []q) \\
    && \square
\end{aligned}
$$

## c)

No son equivalentes. La traza "$\{p\}\rightarrow\{q\}\rightarrow\{p\}\rightarrow\{q\}\rightarrow\dots$" cumple la primera pero no la segunda.

## d)

Demostraremos que las dos se implican entre sí.

$\Leftarrow)$
$$
\begin{aligned}
    \sigma[i] \models (a\ \textbf{U}\ b)
    & \Longrightarrow (\exists k)\ (k \geq i \land (\sigma[k] \models b) \land (\forall j) (i \leq j < k \Rightarrow (\sigma[j] \models a))) \\
    & \Longrightarrow (\exists k)\ (k \geq i \land (\sigma[k] \models b) \land \\
    & \quad\quad (\forall j) (i \leq j < k \Rightarrow ((\sigma[j] \models a) \lor (\sigma[j] \models b)))) \\
    & \Longrightarrow (\exists k)\ (k \geq i \land (\sigma[k] \models b) \land (\forall j) (i \leq j < k \Rightarrow \sigma[j] \models (a \lor b))) \\
    & \Longrightarrow \sigma[i] \models ((a \lor b)\ \textbf{U}\ b)
    && \square
\end{aligned}
$$
$\Rightarrow)$

Si una traza cumple $(a \lor b)\ \textbf{U}\ b$ debe existir un mundo $k$ de la traza
que cumpla $b$, y todos los mundos $j$ anteriores deben cumplir $a \lor b$. Como hay
por lo menos un mundo $k$ en la traza que cumple $b$, existe un mundo $j_b \leq k$ tal
que ningún otro mundo anterior cumple $b$. Como todos los mundos anteriores a $k$
deben cumplir $a \lor b$, y $j_b \leq k$, entonces todos los mundos anteriores a $j_b$ deben
también cumplir $a \lor b$. Pero $j_b$ era el primer mundo que cumplía $b$, o sea, ningún mundo
de índice menor a $j_b$ cumple $b$. Como esos mundos cumplen $a \lor b$ pero no cumplen $b$,
cumplen $a$. Esto quiere decir que existe un mundo $j_b$ que cumple $b$, y que todos los mundos
anteriores cumplen $a$. Esto entonces quiere decir que esta traza cumple $a\ \textbf{U}\ b$.

## e)

No son equivalentes. La traza "$\{a\}\rightarrow\{b\}\rightarrow\{a\}\rightarrow\{b\}\rightarrow\{c\}$" cumple la primera pero no la segunda.

# Ejercicio 3

El LTS lo representé en la herramienta LTSA así:
```
E1 = (a->E2 | a->E3),
E2 = (b->E3),
E3 = (b->E2 | c->E4 | a->E5),
E4 = (c->E3),
E5 = (c->E3).
```

## a)

Corrí
```
assert A = ([](a || b || c))
```
y la herramienta no encontró errores, por lo que la fórmula es válida.

## b)

Corrí
```
assert B = ([]a || []b || []c)
```
y la herramienta encontró errores, por lo que la fórmula no es válida.

## c)

Corrí
```
assert C = <>[]c
```
y la herramienta encontró errores, por lo que la fórmula no es válida.

## d)

Corrí
```
assert D = []a
```
y la herramienta encontró errores, por lo que la fórmula no es válida.

## e)

Corrí
```
assert E = (a U (b || c))
```
y la herramienta no encontró errores, por lo que la fórmula es válida.


## f)

Corrí
```
assert F = (X (!c) -> X (X (c)))
```
y la herramienta encontró errores, por lo que la fórmula no es válida.

