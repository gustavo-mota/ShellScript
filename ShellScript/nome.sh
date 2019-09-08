#!/bin/bash

var = "global_local.sh"

date -r &var +%H

for n in *; do printf '%s\n' "$n"; done #pega os arquivos

dire=`pwd` #pega o nome do diretório atual
echo $dire #retorna o nome do diretório
nomedire=$dire #salva em string o nome do diretorio salvo
echo $nomedire #retorna o string salvo