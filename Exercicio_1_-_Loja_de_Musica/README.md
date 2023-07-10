# <H1> Loja de Musica </H1>

<div><H2>
<br>UNIVERSIDADE CATÓLICA DE BRASÍLIA
<br>CURSO: BACHAREL EM CIÊNCIAS DA COMPUTAÇÃO
<br>DISCIPLINA: PROGRAMAÇÃO ORIENTADA A OBJETOS
<br>DOCENTE: HIALLY RABELO VAGUETTI
<br>DISCENTE: RAFAEL RIKI OGAWA OSIRO</br>
</H2></div>

### Atividade Avaliativa (2,0 pontos) - Polimorfismo:

Exercício 1: Uma loja que vende CD e DVDS deseja construir um cadastro
com seus produtos. Para tanto, foi elaborado o diagrama de classes dado na
Figura 1.1.

![image](https://user-images.githubusercontent.com/79678821/199741031-07ca9f05-a276-43c6-b9aa-9a6e63692f62.png)

Figura 1.1: Hierarquia de classes para construir um cadastro de mídias.

<br>Abaixo fornece uma descrição dos métodos que deverão ser elaborados para cada uma das classes.

Método: Descrição
<br>getTipo(): Retorna uma String com o nome da classe.</br>
<br>getDetalhes(): Retorna uma String com as informações contidas nos campos.</br>
<br>printDados(): Imprime as informações contidas nos campos da classe. Para tanto, usa dois métodos para recuperar estas informações: getTipo() e getDetalhes()</br>
<br>getTipo() e getDetalhes(): Estas funções por sua vez são polimórficas, ou seja, seu tipo retorno varia de acordo com a classe escolhida, tal que este método é sobreposto nas subclasses.</br>
<br>inserirDado s(): Insere os dados necessários para se preencher os campos de objeto de uma dada classe. Seu comportamento é polimórfico.</br>

Além dos métodos descritos acima, deverão ser criados os métodos get e set correspondentes para retornar e modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem parâmetros de cada classe. Criar um programa que simule o uso de um cadastro de CD e DVDs.
