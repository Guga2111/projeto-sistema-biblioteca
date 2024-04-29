public abstract class Pessoa {
    // atributos.
    private String nome;
    private String endereco;
    private String telefone;

    // contrutor da classe.
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // getters e setters.
    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setEndereco(String endereco){
        this.endereco = endereco;
    }

    String getEndereco(){
        return endereco;
    }

    void setTelefone(String telefone){
        this.telefone = telefone;
    }

    String getTelefone(){
        return telefone;
    }
    public void printarInformacoes(){
        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu endereço é: " + endereco);
        System.out.println("O seu telefone é: " + telefone);
    }
}
