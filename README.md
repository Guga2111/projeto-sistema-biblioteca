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
## Requisitos adicionais
### Valor com desconto
- O valor com desconto é calculado a partir do seu ranking na livraria (isso faz parte do easterEgg) onde quanto maior o ranking maior o desconto no valor do livro emprestado.
