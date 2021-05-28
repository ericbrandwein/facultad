.PHONY: all clean

all: seminario.pdf

seminario.pdf: seminario.tex
	pdflatex seminario.tex
	pdflatex seminario.tex

clean:
	rm -rf ./*.pdf ./*.aux ./*.log ./*.tex~ ./*.toc ./*.tex.backup ./*.snm ./*.vrb ./*.nav ./*.out ./*.fdb_latexmk ./*.maf ./*.mtc ./*.mtc0 ./*.synctex.gz ./*.fls ./*.blg

