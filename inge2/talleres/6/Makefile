entregable: informe entregable.lts
	zip --junk-paths entregable.zip informe/informe.pdf entregable.lts

informe: informe/informe.md
	cd informe && pandoc informe.md -o informe.pdf -V geometry:margin=3cm

