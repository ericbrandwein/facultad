## Ejercicio 1

a) ¿Qué definiciones de las variables a y c alcanzan la lı́nea #5? (`while (!(c>a)) {`)
b) ¿Qué definiciones de las variables a y c alcanzan la lı́nea #8? (`a = c-a`)
c) ¿Qué definiciones de la variable c alcanza la lı́nea #6? (`c = c+c`)

### Respuestas

*Aclaración:* Para hacer que Soot analice la línea #8 agregué al final un `return a + c`.

a) Las definiciones `c = 1` y `c = c + c` alcanzan la línea #5 para `c`, y las definiciones `a = 8` y `a = 5` la alcanzan para `a`.

b) Las definiciones `c = 1` y `c = c + c` alcanzan la línea #8 para `c`, y las definiciones `a = 8` y `a = 5` la alcanzan para `a`.

c) Las definiciones `c = 1` y `c = c + c` alcanzan la línea #6 para `c`.

## Ejercicio 2

a) ¿Cuál es el conjunto de variables vivas en la lı́nea #5? (`r=c`)
b) ¿Cuál es el conjunto de variables vivas en la lı́nea #7? (`r=d`)
c) ¿Cuál es el conjunto de variables vivas en la lı́nea #9? (`return r`)

### Respuestas

*Aclaración:* El output de Soot es el OUT de cada línea. Hablando con Leandro Nahabedian se decidió responder cada pregunta con el OUT de la línea anterior a la que se está preguntando.


a) {`c`, `d`}

b) {`c`, `d`}

c) {`r`}

## Ejercicio 3

¿Qué valores abstractos de las variables c1 y c2 pueden alcanzar la lı́nea #3? (`return c1.value`)

### Respuesta

Tanto `c1` como `c2` no pueden ser `null`.