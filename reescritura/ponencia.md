- El lambda calculo simplemente tipado puede simular la logica intuicionista o constructiva con sus tipos y sus reglas de tipado. Lo malo es que no puede demostrar A \lor \notA como tautología, o sea que no puede simular la lógica clásica.

- Para arreglar esto, se propusieron muchas extensiones y modificaciones. Una de ellas es el cálculo lambdamu, que de alguna manera agrega algo así como GOTOs al cálculo lambda.

- Otro de estos es el lambda^sym_prop, descrito por Franco Barbanera y Stefano Berardi, que es el que voy a contarles hoy. La particularidad de este es que agrega otro conjunto de variables atómicas, que son las variables negadas, y que define \lnot \lnot A como siendo igual a A.

- Además, hace que la aplicación sea simétrica, o sea, si tenés A aplicado a B, podés tomar a A como la función y B el argumento, o al revés.

- Pasamos a describir primero la sintaxis. Tenemos los tipos y los m-tipos. Los m-tipos son:
A ::= ...
y los tipos son:
C ::= A | bot

Se diferencian los tipos de los m-tipos porque no se quiere que bottom sea parte de ninguna fórmula compleja. Esto es por temas técnicos, para probar la normalización fuerte.

- Se define la negación de un m-tipo como:
blahblahblah

Con estas reglas se puede probar que \lnot \lnot A = A.

- Ahora pasamos a las reglas de tipado.

blahblahbahl

- La lógica clásica que se asocia con este sistema es completa. Como ejemplo, acá están las derivaciones de la regla de eliminación de la comjunción, y la regla de la eliminación de la implicación.

blahblahblah

- Las reglas de reducción son:

blahblahblah

Vemos que son simétricas por culpa de la estrella, excepto la triv, que está para que por ejemplo <A, P> : A \land bottom sea reducible a P : bottom.

- Lambda_prop^sym es fuertemente normalizante, pero no es CR. Un ejemplo de un término que no confluye es:

blahblahblah

