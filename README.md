# Bolao Copa do Mundo Qatar 2022
Projeto desenvolvido pelos alunos do curso de programação do senac

## Classes e Atributos 
	Bolão 
----------------------------------------
Cadastro dos usuarios
Cadastro dos times/seleção
Definir os padrões do bolão(regras de participação)
Gerar/cadastrar a tabela de jogos
- quantidade de gols  
- pontuação da fase de grupos
- definir que ganhou e atualizar a tabela
definir as datas dos jogos
dar palpites
porcentagem de vitoria por palpite
mostrar os resultados dos palpites apos o jogo
quem acertou mais palpites

				classes
--------------------------------------------
Usuario
Endereço
Documentação
Times
Tabela de Jogos
Classificação
Gols
Palpites
Premiação

					Usuario
-------------------------------------------
Nome
CPF && RG || CNPJ
Idade
Endereço
palpites
Pontuação
contato

					Endereço
---------------------------------------------
Logradouro
Numero Casa
Referencia
Cep
Cidade
Estado

					Documentação
------------------------------------------------
CPF
RG
CNPJ

					Times/Seleções
-------------------------------------------------
Nome
Quantidade de jogadores
Nome do tecnico
Quantidade de jogos ja ganho na pré temporada
Jogos jogados
Classificação
Gols

					Tabela de Jogos
--------------------------------------------------
Grupos
Enfrentamento(qual time joga)
Data dos Jogos
Classificação

					Classificação
-----------------------------------------------------
Vitorias
Derrotas
Pontuação
Gols

					Gols
------------------------------------------------------
Quantidade de gols

					Palpites
-------------------------------------------------------
Times
Quantos Gols
Vitoria || derrota

					Premiação
--------------------------------------------------------
Usuario
premio


public class Classificacao {
private Long id_classificacao
private Integer vitorias;
private Integer derrotas;
private Integer empates;
private Integer golsFeitos;
private Integer golsContra;
private Integer SaldoGols;
private Integer pontuacao
}