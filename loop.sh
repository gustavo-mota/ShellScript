#!/bin/bash

#Leitura recursiva dos arquivos a partir do diretório atual
for f in $( ls -R); do #listagem
	echo $f #exibição
done