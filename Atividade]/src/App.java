import animeJava.Shounen;
import animeJava.Isekai;
import animeJava.Mecha;

public class App {
    public static void main(String[] args) {
        Shounen naruto = new Shounen("Naruto", 220, "Naruto");
            naruto.exibirInfo();
        System.out.println();
        
        Isekai konosuba = new Isekai("Konosuba", 31, "Rei Demônio");
            konosuba.exibirInfo();
        System.out.println();
        
        Mecha powerRangers = new Mecha("Power Rangers", 145, "Godzilla");
            powerRangers.exibirInfo();
        System.out.println();
    }
}