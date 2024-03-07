


public class Musica {
    private String titulo;
    private String compositor;

    private String duracao;

    public void Musica(String titulo , String compositor , String duracao){
        this.compositor = compositor;
        this.titulo = titulo;
        this.duracao = duracao;

    }

    public String getTitulo() {
        return titulo;
    }


    public String getCompositor() {
        return compositor;
    }

    public String isDuracao() {
        return duracao;
    }

    public void tocaMusica() {
        System.out.println("Tocando a música:" + this.titulo);
    }

}
