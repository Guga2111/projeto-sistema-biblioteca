# projeto-sistema-biblioteca
## Classes
### Pessoa
- Superclasse e abstrata (não pode ser inicializada), com atributos nome, endereço e telefone.
- Métodos getters e setters.
### Cliente
- Classe e herda atributos nome, endereço e telefone, e possui os atributos o ID do cliente, um ArrayList do tipo Livro (passando os atributos de livro para cada elemento do arraylist) que armazena todos os livros que o cliente pegou emprestado, um inteiro que armazena os livros lidos pelo cliente, e o rank do cliente.
- Métodos getters e setters.
- Funções de pegar emprestado um livro: 'emprestarLivro', e de devolução de livro: 'devolverLivro'.
### Livro
- Classe com atributos título da obra, autor do livro, id do livro, status do livro (emprestado ou disponível) e o tipo do livro (romance,comédia,etc).
- Métodos getters e setters.
### Biblioteca
- Funciona como classe onde junta todas as funcionabilidades do sistema.
- Classe com apenas dois atributos, são eles um ArrayList do tipo 'Livro' para lista de livros e outro ArrayList do tipo 'Cliente' para lista de clientes.
- Métodos getters e setters.
- Funções de adicionar livro, remover livro, adicionar cliente, remover cliente, emprestar livro, devolver livro, printar livros emprestados para determinado cliente, e printar o número de livro que determinado cliente possui.
### Main
- Funcionabilidade do easter egg, interface do sistema, e o próprio main.
- do while + switch case para atribuir cada funcionabilidade do programa.
## Requisitos básicos
### Polimorfismo
- Na classe 'Pessoa' existe uma função de printar os seus atributos, e na classe herdeira 'Cliente' existe uma função complementada com os argumentos de sua super classe utilizando 'super.printarInformacoes()'.
### Abstração
- Ocorre na super classe 'Pessoa' onde utilizo o comando 'abstract' para ela se tornar abstrata.
- A partir disso a classe não pode ser instanciada, ou seja, iniciada.
### ArrayList
- É utilizado em todo o código, sendo capaz de armazenar elementos em uma única váriavel de forma dinâmica.
- Pode ser visto em: 'Cliente' onde está armazenada todos os livros que aquele usúario pegou emprestado; em 'Biblioteca' armazenando todos os livros existentes na biblioteca e todos os usúarios criados; na 'Main' é utilizado apenas para passagem de valores.
### Encapsulamento
- Utilização de métodos getters e setters em todas as classes e em chamadas (ex: livro.getValor() e cliente.setRank(rankAtual+1) ).
## Requisitos adicionais
### Valor com desconto
- O valor com desconto é calculado a partir do seu ranking na livraria (isso faz parte do easterEgg) onde quanto maior o ranking maior o desconto no valor do livro emprestado.
### Classificação da obra
- Adição do tipo da obra, para facilitar a identificar do que se trata a obra.
### Geração de arquivo txt
- Após a execução do programa é gerado um arquivo txt ("Contas.txt") onde é exibido o rank atual dos usúarios por nome e quantos livros foram lidos por tal.
### Adição de funcionalidades importanes (não exigidas pela proposta do trabalho)
- Print de todos os livros e suas informações (Nome da obra, autor, identificador, status, tipo, valor).
- Print de todos os livros que encontram-se emprestados para determinado usúario.
- Print de quantos livros aquele usúario possui emprestados.
## Easter Egg
- O easter consiste em uma brincadeira que gera descontos no sistema bancário, através do sistema de ranks.
- A cada 5 vezes que ler um livro (assim devolvendo-o) o sistema da um rankup em sua conta.
- Esse jeito foi feito de uma forma simples, apenas para simplificar a ideia do easter egg que gostaria de ser passada no projeto.
- Pórem poderia ter utilizado potenciação, tags (cobre,prata,ouro,diamante,etc...) para calcular o desconto do usúario e para determinar seu rankUP.
