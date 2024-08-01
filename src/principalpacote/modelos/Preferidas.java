package principalpacote.modelos;

public class Preferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getNome() + "é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getNome() + "é um dos que todo mundo está curtindo");
        }
    }
}

