## Por qué los planar graphs son minor-closed?

Sacar vértices o aristas no cambia. Hacer la contracción es más difícil. Podemos probar que no hay un K_5 ni un K_{3,3} por ejemplo.

## Para toda familia F, exc(F) es minor-closed

Ponele que no, o sea, hay un minor H de un grafo G en F que no esta en F. Como H no esta en F, contiene un grafo de F como minor. Es decir, existe una combinacion de operaciones sobre H que lleva a un grafo de F. Pero el mismo tipo de operaciones llevo de G a H, y por lo tanto todo minor de H es minor de G, y entonces G tiene un minor que esta en F. Absurdo.

## Para toda clase minor-closed C, el conjunto de grafos minor-minimal en C complemento es unico

Suponete que hay dos conjuntos M y M' minor minimal, que quiere decir que todo grafo de C complemento o está en M o tiene un minor en M, y además ningún grafo de M tiene otro minor en M. O sea, hay un grafo G ponele en M que no esta en M'. O sea que G está en C complemento, y como no está en M' tiene un minor en M', y por lo tanto M no era minor-minimal.

## Un poset (P, <=) es well-quasi-ordered si toda secuencia infinita tiene dos elementos ordenados uno menor que el otro. Esto es equivalente a que no tenga ni una cadena infinita descendiente ni una cadena infinita de elementos incomparables?

=> Trivial
<= Toda cadena infinita tiene por lo menos dos elementos comparables y dos elementos no descendientes, o sea, o ascendientes o no comparables. Supongamos que hay una cadena infinita sin elementos bien ordenados. O sea, dos comparables y dos incomparables. Todos los comparables son descendientes. Sabemos que hay infinitos pares de elementos incomparables, porque si hubiera finitos, podemos sacarlos todos y tenemos una cadena infinita de descendientes. De la misma manera hay infinitos pares descendientes. Tomemos x_i el primer elemento de la secuencia con infinitos elementos incomparables a el. Si no existe, todos los elementos tienen infinitos menores, y entonces podemos formar la secuencia infinita descendiente agarrando siempre el primer elemento menor al último puesto en la nueva secuencia que se encuentre en la vieja. Tomemos entonces la secuencia inducida por x_i y todos los elementos incomparables. Esta es otra secuencia infinita, y tiene que de nuevo que tener un elemento x_j diferente que x_i que tenga infinitos elementos incomparables. Tomamos la secuencia inducida por los elementos incomparables a x_j, que son incomparables a x_i. Como podemos hacer esto infinitamente, encontramos la cadena infinita de elementos incomparables.

## La relación de minor en grafos no tiene infinite descending chain.

Sea G_1 el primer grafo de una infinite descending chain. Como G_1 es finito, hay finitos grafos menores a él, y por lo tanto hay finitos grafos en la infinite descending chain. Absurdo.

## La secuencia (T_{j1}'', ...) no puede ser mala. O sea, tiene que tener dos elementos ordenados, el segundo mas grande que el primero.

No se. Ponerles un padre y meterlos en la secuencia original no sirve porque podria tranquilamente ser el T_{j1} igual a T_{j1}'' con un padre mas.

## Los grafos no son WQO con respecto a la relacion de contraction minor.

Los grafos independientes son todos incomparables entre si, ya que no tienen aristas que se puedas contraer.

## Los grafos no son WQO con respecto a la relacion de topological minor. La relacion es como minor pero solo te deja simplificar caminos.

Usar el ciclo con pinches.

## Tw(forest) = 1

Enraizas el arbol. Agregas una bolsa que tiene solo a la raiz. Cada arista es otra bolsa. Conectas las bolsas a la bolsa de la arista del padre. 

## Tw(cycle) = 2

Sacas un elemento del ciclo. Haces el tree decomposition del path que te quedo. Agregas el elemento sacado a todas las bolsas.

Por otro lado, podes encontrar un bramble que sean 1 vértice del ciclo, el adyacente, y todo el resto.

## Tw(K_a,b) = min{a,b}

Sea a el conjunto mas chico. Haces que todas las bolsas tengan todos los elementos de a, y un elemento de b. Cada elemento de b va a estar en una sola bolsa, y los de a van a estar en todas, asi que los conectas como quieras.

Por otro lado, haces un bramble en el que cada conjunto tenga un elemento de a y otro de b, sin interseccion. Todos se tocan porque los de a se tocan con todos los de b. Por otro lado, no hay ningún vértice en más de un conjunto, y por lo tanto necesitas un vértice por cada conjuntito.

## Tw(outerplanar) y tw(series-parallel) <= 2

Para outerplanar, lo dibujas, y haces el path decomposition de cada cara tal que la ultima bolsa tenga la arista que comparta con la proxima cara, y la primer bolsa tenga la arista que comparte con la anterior. Despues, las concatenas.

Para series parallel, ponerlo en serie es simplemente renombrar el sink del primero y el source del segundo, y pegar los arboles en cualquier bolsa de cada subarbol que tenga el nuevo vertice. Ponerlo en paralelo no se que onda.

## K_{2k, k} es k-well-linked

tiene que pasar que cualquier par de conjuntos Y, Z con igual tamaño <= k no sean separables, o sea, necesites por lo menos |Z| elementos para separarlos. Si Y y Z tienen elementos del mismo conjunto, necesitas sacar todos los del otro conjunto para separarlos. Sino, tienen l elementos de diferentes conjuntos. Pero para separarlos vas a necesitar l elementos, porque todos los de Y estan conectados a todos los de Z.

## Z ⊆ (V \ W ) ∩ X, |Z| = k + 1 

Los conjuntos V_tj \cap X tienen menos de k elementos, y si a W le sacamos cada V_tj, la suma de los otros es menor o igual a k. Por lo tanto, W tiene menos de 2k elementos de X.

## La complejidad de encontrar un k-well-linked dado que el conjunto X cumple k <= |X| <= ck es 4^{ck} * n^{O(1)}

Tenemos que probar que hay 4^{ck} posibles subconjuntos Y y Z, porque por cada uno hacemos un algoritmo de flujo. Una cota re burda es pensarlo así: cada elemento está o en ningún subconjunto, en el subconjunto Y, en el subconjunto Z, o en los dos. Por lo tanto hay 4 posibilidades para cada elemento, y hay ck elementos, por lo tanto hay menos de 4^{ck} pares de subconjuntos.

## Un ejercicio de una demo

## Una tree decomposition se puede convertir en nice con k*x nodos en O(k^2*n)


Suponemos que no hay más bolsas que k^2*n, ya que sino esto es imposible.
Simplificamos bolsas vacías: la suplantamos por un hijo. Si no tiene, la eliminamos. Simplificamos también las bolsas que son subconjuntos de su padre o de su hijo.

Primero, agarras las bolsas de muchos hijos y las convertis en secuencias de joins de dos bolsas iguales. La cantidad de vértices agregados acá es 2*(hijos - 1) <= 2*(x - 1). Si k es 1, esto ya podría ser un problema.

Después, convertís las aristas entre nodos diferentes a nodos paulatinos. Acá se agrega un nodo por cada elemento en la diferencia entre las bolsas. Cada elemento de una bolsa puede aparecer en un nodo en donde aparece y en otro donde desaparece, y por lo tanto podrían haber 2*k*x bolsas acá. Ejemplo: 2K_2. El lemma es super mentira. Quizá vale para O(k*x) bolsas.

## vertex cover e independent set pueden ser expresados en MSO_2

vertex cover: existe un conjunto de vertices que cubren las aristas, o sea, tal que para toda arista existe un vertice en el conjunto que toca con la arista

independent set: existe un conjunto de vertices tal que no existe una arista tal que existan dos vertices en el conjunto que toquen con la arista

## vertex cover, feedback vertex set, long path son minor-closed

vertex cover: si sacas aristas tenes que cubrir menos aristas, asi que necesitas menos o igual vertices. Si sacas vértices todas las aristas que tocaban ese vértice ya no las tenés que cubrir, y entonces no importa si ese vértice estaba en el vertex cover. Si comprimís aristas, alguno de los dos vértices de la arista tenía que estar en el vertex cover, y entonces este nuevo vértice al ponerlo en el vertex cover se cubren las mismas aristas y no se cambia el vertex cover number.

feedback vertex set: si sacas aristas hay menos ciclos. Si sacás un vértice todos los ciclos en los que estaba ya no existen más, y entonces si estaba en el set no importa. Si contraés aristas, los ciclos que pasaban por esa arista se convirtieron en ciclos que pasan por el vértice nuevo, o sea que el set anterior te sirve para el actual.

long path: si sacas una arista tenes paths mas cortos. Si sacas un vértice también. Si contraés aristas también.

## Dominating set, connected vertex cover, r-dominating set son contraction-closed

dominating set: si ninguno de los dos vertices estaba en el conjunto, eran dominados por algun/os vertices, que dominan el nuevo. si uno de los dos estaba, listo, agregas el nuevo al conjunto.

connected vertex cover: habia un conjunto conexo que cubría todas las aristas, en particular, la arista que comprimimos, y entonces hay por lo menos uno de los vertices de la arista que estaba en el conjunto. Pones en el nuevo vertice en el conjunto y sigue siendo conexo.

r-dominating set: conjunto tal que todos los vértices no en el conjunto están a distancia máximo r de un elemento del conjunto. Las distancias se achican, así que no cambia nada.

## Price of homogeneity: tenés que deszoomear mucho para conseguir una homogeneous flat r-wall.