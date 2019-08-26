#!/bin/bash
declare -a ARRAY
#associar filedescriptor 10 com stdin
exec 10<&0
#modificar stdin com o arquivo forncido no parametro
exec < $1
ler count = 0
while read LINE; do
	ARRAY[$count]=$LINE
	((count++))
done

echo numero de elementos: ${#ARRAY[@]}
echo ${ARRAY[@]}
exec 0<&10 10<&-