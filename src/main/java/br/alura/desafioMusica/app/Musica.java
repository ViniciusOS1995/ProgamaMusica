package br.alura.desafioMusica.app;

import br.alura.desafioMusica.calculo.MetodosParelhos;

public class Musica extends Audio implements MetodosParelhos {
    public Musica(String autor, String titulo, int duracao, String album, String genero) {
        super(autor, titulo, duracao);
        this.album = album;
        this.genero = genero;
    }

    private String album;
    private String genero;

    @Override
    public void calculaClassificacao() {
        if (getCurtidas() >= 50) {
            System.out.println("Musica Top do momento!");
        } else if (getCurtidas() >= 25) {
            System.out.println("Musica que a galera curte!");
        }else {
            System.out.println("Talvez você possa gostar dessa musica!");
        }
    }

    @Override
    public void reproduzir(){
        visualizacoes++;
        System.out.println("Genero Musical: " + genero);
        System.out.println("Reproduzindo: " + titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Do Album: "+ album);
        System.out.println("Tem a duração em minutos de: " + duracao);
        System.out.println("Tem " + curtidas+ " de curtidas\n");
    }
}
