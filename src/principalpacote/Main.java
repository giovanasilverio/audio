package principalpacote;
import principalpacote.modelos.Musica;
import principalpacote.modelos.Podcast;
import principalpacote.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Cardigan ");
        minhaMusica.setAutor("Taylor Swift ");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setNome("PodPah ");
        meuPodcast.setAutor("Igão e Mítico ");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Preferidas minhapreferida = new Preferidas();
        minhapreferida.inclui(meuPodcast);
        minhapreferida.inclui(minhaMusica);

    }
}
