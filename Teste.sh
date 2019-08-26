#!/bin/bash
Horas_Arquivo=`date -r PrimeiroPrograma.java +%H`
Horas=`date +%H`
Minutos_Arquivo=`date -r PrimeiroPrograma.java +%M`
Minutos=`date +%m`
if [ $Horas_Arquivo-lt $Horas -a $Minutos_Arquivo -lt $Minutos ] ; then #Hora e minuto do arquivo menor que a atual
		echo "O arquivo tem menos de 24 horas"	#Retorna numero excessivo de args
	else 
		echo "O arquivo tem mais de 24 horas"
	fi
done