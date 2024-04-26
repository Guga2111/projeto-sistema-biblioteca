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
  
