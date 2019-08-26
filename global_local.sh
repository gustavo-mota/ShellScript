#!/bin/bash

VAR="variavel global"
funcao_local(){
local VAR="variavel local"
echo $VAR
}
echo $VAR
funcao_local
echo $VAR
