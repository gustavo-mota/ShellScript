#!/bin/bash
sistemas=( 'Debian Linux' 'Readhat Linux' Ubuntu Linux )
contador=${#sistemas[@]}
for (( i=0;i<$contador;i++)); do
	echo ${sistemas[${i}]}
done
