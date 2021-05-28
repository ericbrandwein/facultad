# 1. No logré aumentar la cobertura de líneas ni de branches, ya que estaba en el 100%
# 2. Escribiendo tests a mano en una nueva clase CustomTest, logré incrementar el mutation
# score a 86%. Se podría aumentar aún más si se escribieran tests para el método hashCode(),
# pero eso implicaría hacer tests muy frágiles que comparen el valor devuelto por hashCode()
# con un valor hardcodeado en el test, lo cual no es una buena práctica, ya que el contrato
# de hashCode no incluye números particulares para instancias particulares, sino solo la
# condición que dos instancias iguales deben tener el mismo hashCode.