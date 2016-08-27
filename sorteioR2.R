##sorteador

rm(list=ls(all=TRUE))

n=15  # tamanho da amostra sorteada

populacao=c(17.3,19.3,19.5,19.7,22.9,23.1,26.4,26.8,27.6,28.1,28.2,28.7,29.0,29.6,29.9,29.9,30.3,31.3,36.0,39.5,40.4,44.3,44.6,50.4,55.9) # população

m=length(populacao)  #Tamanho da população
individuo=seq(1,m,1) #Enumeração da população


matriz=matrix(c(individuo,populacao),ncol=2) # população enumerada 
matriz

amostrados=sample(individuo,n,replace=F)  #i-ésimos indivíduos sorteados
amostrados

sorteados=populacao[amostrados]  #leitura dos sorteados
sorteados

indSort=matrix(c(amostrados,sorteados),ncol=2)
indSort


