DIR_ORIG="/diretorio/a/ser/compactado/"
DIR_DEST="/diretorio/a/ser/enviado/o/arquivo"
BKP_NAME="nome-do-arquivo.tgz"

# compactação do diretório de origem diretamente no diretório de destino
tar -czpf ${DIR_DEST}${BKP_NAME} ${DIR_ORIG}

# mensagem de resultado
echo "Seu backup foi realizado com sucesso."
echo "Diretório: ${DIR_ORIG}"
echo "Destino: ${DIR_DEST}${BKP_NAME}";
exit 0


#Somente uma observação o valor da variavel DIR_DEST tem que terminar com / pois na hora de concatenar DIR_DEST com $BKP_NAME fica errado o caminho por exemplo
#DIR_ORIG="/diretorio/a/ser/compactado/"
#DIR_DEST="/diretorio/a/ser/enviado/o/arquivo"
#BKP_NAME="nome-do-arquivo.tgz"
#tar -czpf ${DIR_DEST}${BKP_NAME} ${DIR_ORIG}
#na execução é substituido por
#tar -czpf ="/diretorio/a/ser/enviado/o/arquivonome-do-arquivo.tgz /diretorio/a/ser/compactado/

#teria que ser assim
#DIR_ORIG="/diretorio/a/ser/compactado/"
#DIR_DEST="/diretorio/a/ser/enviado/o/arquivo/"
#BKP_NAME="nome-do-arquivo.tgz"
#tar -czpf ${DIR_DEST}${BKP_NAME} ${DIR_ORIG}
#na execução é substituido por
#tar -czpf ="/diretorio/a/ser/enviado/o/arquivo/nome-do-arquivo.tgz /diretorio/a/ser/compactado/