package animeJava;
public class Shounen extends Anime {
    private String protagonista;
    
    public Shounen(String nome, int episodios, String protagonista) {
        super(nome, episodios);
        this.protagonista = protagonista;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println(nome + " tem " + episodios + " episodios " + " e o protagonista é " + protagonista);
    }
}
