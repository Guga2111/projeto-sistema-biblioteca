import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private String id;
    private String status; // "Disponível" ou "Emprestado".
    private String tipo; // Exemplo: "Romance", "Comédia", Etc.
    private ArrayList<Double> avaliacoes; // lista de avaliações!
    private double avaliacaoMedia; // Soma de todas as avaliações do livro, cliente podendo avaliar em 1 estrela 2, 3 ,4 ,5 estrelas...
    private double valor;
    public Livro(String titulo, String autor, String id, String status, String tipo, double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.status = status;
        this.tipo = tipo;
        this.valor = valor;
        avaliacoes = new ArrayList<Double>();
    }
    void setAvaliacoes(ArrayList<Double> avaliacoes){
        this.avaliacoes = avaliacoes;
    }
    ArrayList<Double> getAvaliacoes(){
        return avaliacoes;
    }

    void setAvaliacaoMedia(double avaliacaoMedia){
        this.avaliacaoMedia = avaliacaoMedia;
    }

    double getAvaliacaoMedia(){
        return avaliacaoMedia;
    }
    public void adicionarAvaliacoes(double valor){
        avaliacoes.add(valor);

        double temp = 0;
        for(int i = 0; i < avaliacoes.size(); i++){
            temp = temp + avaliacoes.get(i);
        }
        double media = temp/avaliacoes.size();
        setAvaliacaoMedia(media);
        System.out.println("A sua avaliação foi adicionada ao sistema!");
    }

    void setValor(double valor){
        this.valor = valor;
    }
    double getValor(){
        return valor;
    }
    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    String getTitulo(){
        return titulo;
    }

    void setAutor(String autor){
        this.autor = autor;
    }

    String getAutor(){
        return autor;
    }

    void setId(String id){
        this.id = id;
    }

    String getId(){
        return id;
    }

    void setStatus(String status){
        this.status = status;
    }

    String getStatus(){
        return status;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }

    String getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return this.getTitulo();
    }
}
