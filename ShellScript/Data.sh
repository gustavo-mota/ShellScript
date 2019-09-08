#ta errad
oecho "Calculando datas"
echo "Calculando anos"
if [ date -r arq.sh +%Y -eq date +%Y ] ; then #Ano igual
	echo "Os anos sao iguais"
	echo "Calculando mês"
	if [ date -r arq.sh +%m -eq date +%m ] ; then
		echo "Os meses sao iguais"
		echo "Calculando os dias"
		if [ date -r arq.sh +%d -eq date +%d ] ; then
			echo "os dias sao iguais"
			echo "O arquivo nao tem mais de 24 horas"
		else
			echo "Os dias nao sao iguais"
			echo "Calculando 24 horas"
			if [ (date -r arq.sh +%H -lt date +%H) -a (date -r arq.sh +%M -lt date +%m) ] ; then #Hora e minuto do arquivo menor que a atual
				echo "O arquivo tem menos de 24 horas"	
		else 
				#arquivo tem 24 horas
	else
		echo "Os meses nao sao iguais"
else
	echo "Os anos nao sao iguais"