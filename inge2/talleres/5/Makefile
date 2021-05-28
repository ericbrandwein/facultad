entregable: informe tests-ej1 tests-ej4
	zip --recurse-paths entregable.zip informe.pdf tests-ej1/ tests-ej4/

informe:
	pandoc informe.md -o informe.pdf -V geometry:margin=3cm

tests-ej4: ej3/src/test/java/CustomTest.java
	mkdir -p tests-ej4/ && cp $< tests-ej4/

tests-ej1: ej3/src/test/java/StackAr_ESTest.java
	mkdir -p tests-ej1/ && cp $< tests-ej1/

clean:
	rm -rf entregable.zip informe.pdf tests-ej1/ tests-ej4/
