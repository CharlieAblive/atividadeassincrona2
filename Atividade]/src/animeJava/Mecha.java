package animeJava;
public class Mecha extends Anime {
    private String kaiju;
    
    public Mecha(String nome, int episodios, String kaiju) {
        super(nome, episodios);
        this.kaiju = kaiju;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println(nome + " tem " + episodios + " episodios " + " e o kaiju é " + kaiju);
    }
}
