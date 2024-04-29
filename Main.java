import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void interface_biblioteca(){
        System.out.println("\nSelecione uma opção:");
        System.out.println("1. Cadastrar um novo cliente");
        System.out.println("2. Printar todas as informações do cliente");
        System.out.println("3. Adicionar livro à biblioteca");
        System.out.println("4. Remover livro da biblioteca");
        System.out.println("5. Printar todos os livros");
        System.out.println("6. Pegar livro emprestado");
        System.out.println("7. Devolver livro para biblioteca");
        System.out.println("8. Printar todos livros emprestados");
        System.out.println("9. Remover um cliente do sistema");
        System.out.println("10. Printar quantos livros estão emprestados para aquele usuário");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }

    public static void main(String[] args){

    Biblioteca biblioteca = new Biblioteca();

    /*
    biblioteca.adicionarCliente("Nome1", "End1", "Tel1", "Id1");
    biblioteca.adicionarCliente("Nome2", "End2", "Tel2", "Id2");

     */
    biblioteca.adicionarLivro("Lidro1", "Autor1", "ID1", "Disponivel", "Tipo1", 12);
    biblioteca.adicionarLivro("Lidro2", "Autor2", "ID2", "Disponivel", "Tipo2", 41);
    biblioteca.adicionarLivro("Lidro3", "Autor3", "ID3", "Disponivel", "Tipo3", 13);
    biblioteca.adicionarLivro("Lidro4", "Autor4", "ID4", "Disponivel", "Tipo4", 42);
    biblioteca.adicionarLivro("Lidro5", "Autor5", "ID5", "Disponivel", "Tipo5", 14);
    biblioteca.adicionarLivro("Lidro6", "Autor6", "ID6", "Disponivel", "Tipo6", 43);

    Scanner scanner = new Scanner(System.in);

    int opcao;

    do{
        interface_biblioteca();
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1:
                System.out.println("Digite o nome do cliente: ");
                String nomeTemp = scanner.nextLine();

                System.out.println("Digite seu endereço: ");
                String endTemp = scanner.nextLine();

                System.out.println("Digite seu telefone: ");
                String telTemp = scanner.nextLine();

                System.out.println("O seu ID: ");
                String idTemp = scanner.nextLine();

                biblioteca.adicionarCliente(nomeTemp, endTemp, telTemp, idTemp);

                break;
            case 2:
                System.out.println("Digite o nome do cliente, para printar suas informações: ");
                String nomeAtual = scanner.nextLine();

                for(int i = 0 ; i < biblioteca.getLista_clientes().size(); i++){
                    Cliente cliente = biblioteca.getLista_clientes().get(i);

                    if(nomeAtual.equals(cliente.getNome())){
                        biblioteca.printarInfos(cliente);

                        ArrayList<Livro> livrosEmprestados = cliente.getLivrosEmprestados();

                        System.out.print("Livros emprestados: ");
                        for(int y = 0; y < livrosEmprestados.size(); y++){
                            System.out.print( livrosEmprestados.get(y).getTitulo());
                            System.out.print("(" + livrosEmprestados.get(y).getTipo() + ") ");
                        }
                        System.out.print(".\n");
                        break;

                    }
                }
                break;

            case 3:
                System.out.println("Digite o título do livro: ");
                String tituloTemp = scanner.nextLine();

                System.out.println("Digite o autor da obra: ");
                String autorTemp = scanner.nextLine();

                System.out.println("Digite o ID da obra: ");
                String idLivroTemp = scanner.nextLine();

                System.out.println("Digite o tipo do livro: ");
                String tipoLivroTemp = scanner.nextLine();

                System.out.println("Digite o valor de empréstimo do livro: ");
                double value = scanner.nextDouble();

                biblioteca.adicionarLivro(tituloTemp,autorTemp,idLivroTemp,"Disponível", tipoLivroTemp, value);

                break;
            case 4:
                System.out.println("Digite o título do livro que você deseja remover da biblioteca: ");
                String tituloTemp2 = scanner.nextLine();

                biblioteca.removerLivro(tituloTemp2);
                break;
            case 5:
                for(int i = 0; i < biblioteca.getLista_livros().size(); i++){
                    Livro livro = biblioteca.getLista_livros().get(i);



                    System.out.print("[");
                    System.out.print(livro.getTitulo());
                    System.out.print(",");
                    System.out.print(livro.getAutor());
                    System.out.print(",");
                    System.out.print(livro.getId());
                    System.out.print(",");
                    System.out.print(livro.getStatus());
                    System.out.print(",");
                    System.out.print(livro.getTipo());
                    System.out.print(",");
                    if(livro.getAvaliacoes() != null){
                        System.out.print(livro.getAvaliacaoMedia() + "★");
                    }
                    System.out.println("]");

                }

                break;
            case 6:
                System.out.println("Digite o seu nome: ");
                String nomeCliente = scanner.nextLine();

                for(int i = 0; i < biblioteca.getLista_clientes().size(); i++){
                    Cliente cliente = biblioteca.getLista_clientes().get(i);

                    if(nomeCliente.equals(cliente.getNome())){
                        biblioteca.emprestarLivro(cliente);

                    }

                }
                break;
            case 7:
                System.out.println("Digite o seu nome: ");
                String nomeCliente2 = scanner.nextLine();

                for(int i = 0; i < biblioteca.getLista_clientes().size(); i++){
                    Cliente cliente = biblioteca.getLista_clientes().get(i);

                    if(nomeCliente2.equals(cliente.getNome())){
                        biblioteca.devolverLivro(cliente);
                        
                        biblioteca.easterEgg(cliente);
                        break;
                    }
                }

                break;
            case 8:
                System.out.println("Digite o seu nome: ");
                String nomeCliente3 = scanner.nextLine();

                for(int i = 0; i < biblioteca.getLista_clientes().size(); i++){
                    Cliente cliente = biblioteca.getLista_clientes().get(i);

                    if(nomeCliente3.equals(cliente.getNome())){
                        biblioteca.printarLivrosEmprestados(cliente);
                        break;
                    }
                }
                break;
            case 9:
                System.out.println("Digite o seu nome: ");
                String nomeRemover = scanner.nextLine();

                biblioteca.removerCliente(nomeRemover);
                break;
            case 10:
                System.out.println("Digite o seu nome: ");
                String nomeVer = scanner.nextLine();

                for(int i = 0 ; i < biblioteca.getLista_clientes().size(); i++){
                    Cliente cliente = biblioteca.getLista_clientes().get(i);
                    if(nomeVer.equals(cliente.getNome())){
                        biblioteca.qtdLivrosDeterminadoEmprestados(cliente);
                        break;
                    }
                }
                break;
            case 0:
                System.out.println("Saindo do Sistema!");
                break;
            default:
                System.out.println("ERROR!!!");
        }
    }while(opcao != 0);

    String nomeArquivo = "Contas.txt";

    try{
        FileWriter escritor = new FileWriter(nomeArquivo);
        DecimalFormat formato = new DecimalFormat("#0.00");
        escritor.write("OS DADOS DA CONTAS SERÃO EXIBIDAS A SEGUIR: ");
        escritor.write("\n");

        for(int i = 0; i < biblioteca.getLista_clientes().size(); i++){
            Cliente cliente = biblioteca.getLista_clientes().get(i);

            String indiceConta = String.valueOf(i + 1);

            escritor.write(indiceConta);
            escritor.write(" - ");
            escritor.write("Nome: ");
            escritor.write(cliente.getNome());
            escritor.write(" - ");
            escritor.write("Rank: ");
            String rank = String.valueOf(cliente.getRank());
            escritor.write(rank);
            escritor.write(" - ");
            escritor.write("Livros lidos: ");
            String livrosLidos = String.valueOf((cliente.getLivrosLidos()/2));
            escritor.write(livrosLidos);
            escritor.write("\n");
        }
        escritor.close();
        System.out.println("Foi concluída com sucesso a geração do arquivo txt!");
    } catch (IOException e) {
        System.out.println("Erro na geração do arquivo.");
    }

    }
}
