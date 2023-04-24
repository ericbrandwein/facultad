# Juego del TP

Dos compañeros se organizan para hacer un TP en paralelo, y los dos se prometen que van a hacer la mitad del TP cada uno. Cada uno puede decidir hacerlo o no hacerlo. Si uno decide no hacerlo, el último día antes de la entrega el otro se da cuenta y lo termina lo más rápido posible, pero si los dos decidieron no hacerlo para el último día, no hay forma de salvarla y no lo entregan.

Las recompensas son 10 puntos por entregarlo, pero cada uno pierde dos puntos por el esfuerzo de hacer la mitad del TP.

La matriz del juego en forma normal es la siguiente:

| | Hacerlo | No Hacerlo |
| ----- | :------: | :------: |
| **Hacerlo** | (8, 8) | (6, 10) |
| **No Hacerlo** | (10, 6) | (0, 0) |

- **Es finito**, porque el conjunto de estrategias de cada jugador es finito. 
- **No es de suma cero**, ya que las recompensas de cada combinación de estrategias no suman 0. 
- **No es de información perfecta**, ya que no hay turnos; los dos eligen qué hacer sin saber qué hace el otro.
- **Hay dos equilibrios de Nash puros** en los que uno de los compañeros decide hacer el TP y el otro decide no hacerlo. Si el que lo está haciendo decide no hacerlo, pasa de ganar 6 puntos a ganar 0. Si el que no lo está haciendo decide hacerlo, pasa de ganar 10 puntos a ganar 8.
- **No tiene valor inferior ni superior**, ya que no es un juego de suma cero.