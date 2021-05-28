# Ingeniería de Software 2 - Taller 5
### Eric Brandwein

## Ejercicio 1
Los tests generados por Evosuite se encuentran en el archivo `tests-ej4/StackAr_ESTest.java`.

## Ejercicio 2
Corrieron 27 tests, de los cuales falló uno por un `StackOverflowException`.
Esto fue porque se creó un `StackAr` `A` que contenía otro `StackAr` `B`, que a
su vez contenía al `A`. Por lo tanto, cuando se llama al
`toString()`, se generan llamadas recursiva infinitas entre ellos, las cuales
sobrepasan la capacidad del stack.

## Ejercicio 3
### a)
Logra una cobertura de líneas de 100% (51/51 líneas) y de branches también del 100% (29/29 branches).


### b)
JaCoCo reportó una cobertura de líneas del 100%, con 193 líneas
cubiertas, y de branches del 100%, con 26 branches cubiertos.

Para correr JaCoCo tuve que hacer que se ignore un test que ocasionaba
un `StackOverflowException`. El mismo ocurría porque se
llamaba a `toString()` en una instancia de `StackAr` que contenía otra
instancia de `StackAr`, que a su vez contenía a la primera, haciendo
un bucle infinito de llamadas recursivas a `toString()`, como fue mencionado en
la respuesta del ejercicio 2.

### c)
El testsuite logra un mutation score del 54%, matando 20 mutantes de los
37 generados.

## Ejercicio 4
1. No logré aumentar la cobertura de líneas ni de branches, ya que ya estaba en el 100%.
2. Escribiendo tests a mano en nuevo archivo que se encuentra en `tests-ej4/CustomTest.java`
logré incrementar el mutation score a 86%. Se podría aumentar aún más si se escribieran tests
para el método `hashCode()`, pero eso implicaría hacer tests muy frágiles que comparen el valor
devuelto por `hashCode()` con un valor hardcodeado en el test, lo cual no es una buena
práctica, ya que el contrato de `hashCode()` no incluye números particulares para instancias
particulares, sino solo la condición de que dos instancias iguales deben tener el mismo
`hashCode()`.

