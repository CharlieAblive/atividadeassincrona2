package animeJava;
public class Anime {
    protected String nome;
    protected int episodios;
    
    public Anime(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }
    
    public void exibirInfo() {
        System.out.println(nome + " tem " + episodios + " episodios ");
    }
    
}

