import java.util.ArrayList;
public class Cliente extends Pessoa{
    private String clienteId;
    private ArrayList<Livro> livrosEmprestados;
    private int livrosLidos;
    private int rank;
    public Cliente(String nome, String endereco, String telefone, String cliente_id, int livrosLidos, int rank){
        super(nome, endereco, telefone);
        this.clienteId = cliente_id;
        this.livrosLidos = livrosLidos;
        this.rank = rank;
        this.livrosEmprestados = new ArrayList<Livro>();

    }

    void setRank(int rank){
        this.rank = rank;
    }

    int getRank(){
        return rank;
    }

    void setLivrosLidos(int livrosLidos){
        this.livrosLidos = livrosLidos;
    }

    int getLivrosLidos(){
        return livrosLidos;
    }

    void setClienteId(String cliente_id){
        this.clienteId = cliente_id;
    }

    String getClienteId(){
        return clienteId;
    }

    void setLivrosEmprestados(ArrayList<Livro> livros_emprestados){
        this.livrosEmprestados = livros_emprestados;
    }

    ArrayList<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro){
        for(int i = 0; i < livrosEmprestados.size(); i++){
            if(livro.getTitulo().equals(livrosEmprestados.get(i).getTitulo())){
                livrosEmprestados.remove(i);
                livrosLidos++;
                break;
            }
        }
    }
    @Override
    public void printarInformacoes(){
        super.printarInformacoes();
        System.out.println("O seu ID é: " + clienteId);
        System.out.println("Rank é: " + rank);
        System.out.println("Livros lidos: "+ livrosLidos);
    }
}
