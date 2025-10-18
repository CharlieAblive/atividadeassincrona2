package animeJava;
public class Isekai extends Anime {
    private String vilaoGenerico;
    
    public Isekai(String nome, int episodios, String vilaoGenerico) {
        super(nome, episodios);
        this.vilaoGenerico = vilaoGenerico;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println(nome + " tem " + episodios + " episodios " + " e o vilão é " + vilaoGenerico);
    }
}