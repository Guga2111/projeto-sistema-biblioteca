import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> lista_livros;
    private ArrayList<Cliente> lista_clientes;

    public Biblioteca(){
        this.lista_livros = new ArrayList<>();
        this.lista_clientes = new ArrayList<>();
    }

    void setLista_livros(ArrayList<Livro> lista_livros){
        this.lista_livros = lista_livros;
    }
    ArrayList<Livro> getLista_livros(){
        return lista_livros;
    }

    void setLista_clientes(ArrayList<Cliente> lista_clientes){
        this.lista_clientes = lista_clientes;
    }
    ArrayList<Cliente> getLista_clientes(){
        return lista_clientes;
    }
    public void adicionarLivro(String titulo, String autor, String ID, String status, String tipo, double valor){

        boolean existe = false;
        for(int i = 0; i < lista_livros.size(); i++){
            if(titulo.equals(lista_livros.get(i).getTitulo())){
                existe = true;
                break;
            }
        }

        if(existe){
            System.out.println("O nome do livro digitado já existe!");
        } else{
            lista_livros.add( new Livro(titulo, autor, ID, status, tipo, valor));
            System.out.println("O livro foi adicionado ao Sistema!");
        }

    }

    public void removerLivro(String nome){
        boolean verificarSaida = false;

        for(int i = 0; i <lista_livros.size(); i++){
            if(nome.equals(lista_livros.get(i).getTitulo())){
                lista_livros.remove(i);
                verificarSaida = true;
                break;
            }
        }
        if(!verificarSaida){
            System.out.println("O livro não existe no sistema, dito isso não tem o que ser removido!");
        }
    }

    public void adicionarCliente(String nome, String endereco, String telefone, String ID){

        boolean existe = false;
        for(int i = 0; i < lista_clientes.size(); i++){
            if(nome.equals(lista_clientes.get(i).getNome())){
                existe = true;
                break;
            }
        }

        if(existe){
            System.out.println("O nome " + nome + " já existe no sistema!");
        } else{
            lista_clientes.add( new Cliente(nome, endereco, telefone, ID, 0, 1));
            System.out.println("O usuário " + nome + " foi adicionado!");
        }

    }

    public void removerCliente(String nome){
        boolean verificarSaida = false;
        for(int i = 0; i < lista_clientes.size(); i++){
            if(lista_clientes.get(i).getNome().equals(nome)){
                lista_clientes.remove(i);
                verificarSaida = true;
                break;
            }
        }
        if(!verificarSaida){
            System.out.println("O cliente que você inseriu não existe!");
        }
    }

    public void emprestarLivro(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual livro voce deseja pegar emprestado? \n Qual dessas opções abaixo (escolha o índice):");
        for(int i = 0; i < lista_livros.size(); i++){
            System.out.println((i+1) + " - " + lista_livros.get(i).getTitulo());
        }
        int opcao = scanner.nextInt();

        Livro livro = lista_livros.get(opcao-1);
        if(livro.getStatus().equals("Emprestado")){
            System.out.println("Livro indisponível!");
            return;
        }
        double tempValue = livro.getValor() - (cliente.getRank() * 0.11);
        System.out.println("O valor do livro para o cliente " + cliente.getNome() + " é de " + tempValue + " reais.");
        cliente.emprestarLivro(livro);
        livro.setStatus("Emprestado");

    }

    public void devolverLivro(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o livro que voce deseja devolver?");
        String livroTemp = scanner.nextLine();

        int indiceEncontrado = -1;

        for(int i = 0; i < lista_livros.size(); i++){
            if(livroTemp.equals(lista_livros.get(i).getTitulo())){
                indiceEncontrado = i;

                break;
            }
        }

        Livro livro = lista_livros.get(indiceEncontrado);

        if(indiceEncontrado == -1){
            System.out.println("O livro que voce quer devolver não existe!");
            return;
        }

        int indiceAtual = cliente.getLivrosLidos() + 1;
        cliente.setLivrosLidos(indiceAtual);
        cliente.devolverLivro(livro);

        while(true){
            System.out.println("Digite a sua avaliação para o livro! 1-5★");
            double numeroTemp = scanner.nextDouble();
            if(numeroTemp <= 5){
                livro.adicionarAvaliacoes(numeroTemp);
                break;
            } else{
                System.out.println("Número digitado inválido!");
            }
        }

        livro.setStatus("Disponível");
    }

    public void printarLivrosEmprestados(Cliente cliente){
        for(int i = 0 ; i < cliente.getLivrosEmprestados().size(); i++){
            System.out.println(cliente.getLivrosEmprestados().get(i));
        }
    }

    public void qtdLivrosDeterminadoEmprestados(Cliente cliente){

        int qtd = cliente.getLivrosEmprestados().size();
        if(qtd == 0){
            System.out.println("Você não possui nenhum livro emprestado da biblioteca!");
            return;
        }
        if(qtd == 1){
            System.out.println("Você possui 1 livro emprestado!");
        }else{
            System.out.println("Você possui " + qtd + " livros emprestados!");
        }
    }

    public void easterEgg(Cliente cliente){
        int rankAtual = cliente.getRank();
        int proximaMeta = rankAtual * 10;

        int livrosDevolvidos = cliente.getLivrosLidos() - ((rankAtual - 1) * 10);

        if(livrosDevolvidos >= 10){
            System.out.println("Parabéns você subiu de rank!");
            cliente.setRank(rankAtual+1);
            System.out.println("Agora seu rank é de nivel " + cliente.getRank() + ".");
        }
    }
    public void printarInfos(Cliente cliente){
        cliente.printarInformacoes();
    }

}
