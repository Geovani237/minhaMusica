package br.com.alura.minhaMusica.modelos;

public class MinhaPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassficacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo!");
        }
    }
}
