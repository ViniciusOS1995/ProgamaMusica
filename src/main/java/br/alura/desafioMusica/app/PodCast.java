package br.alura.desafioMusica.app;

import br.alura.desafioMusica.calculo.MetodosParelhos;

public class PodCast extends Audio implements MetodosParelhos {
    public PodCast(String autor, String titulo, int duracao, String episodio, String descricao) {
        super(autor, titulo, duracao);
        this.episodio = episodio;
        this.descricao = descricao;
    }

    private String episodio;
    private String descricao;

    @Override
    public void calculaClassificacao() {
        if (getVisualizacoes() >= 50) {
            System.out.println("Podcast Top do momento!\n");
        } else if (getVisualizacoes() >= 25) {
            System.out.println("Podcast que a galera curte!\n");
        }else {
            System.out.println("Talvez você possa gostar desse podcast!\n");
        }
    }

    @Override
    public void reproduzir(){
        visualizacoes++;
        System.out.println("Reproduzindo: " + titulo);
        System.out.println("Episodio: " +episodio);
        System.out.println("Autor: "+autor);
        System.out.println("Tem a duração em minutos de: " + duracao);
        System.out.println("Descrição: " +descricao);
        System.out.println("Tem " +curtidas+ " de curtidas\n");
    }

}
