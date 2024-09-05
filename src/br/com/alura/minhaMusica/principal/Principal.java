package br.com.alura.minhaMusica.principal;

import br.com.alura.minhaMusica.modelos.MinhaPreferidas;
import br.com.alura.minhaMusica.modelos.Musica;
import br.com.alura.minhaMusica.modelos.Podcast;

public class Principal {
    public static void main (String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Hey Jude");
        musica.setCantor("The Beatle");

        for(int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcus Mendes");

        for(int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhaPreferidas preferidas = new MinhaPreferidas();

        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
