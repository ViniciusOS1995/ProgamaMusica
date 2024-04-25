package br.alura.desafioMusica.main;

import br.alura.desafioMusica.app.Musica;
import br.alura.desafioMusica.app.PodCast;

public class Principal {
    public static void main(String[] args) {
        PodCast joaozinho = new PodCast("Joaozinho Talk", "Falas Aleatórias", 60, "Piloto", "Podcast sobre séries");
        joaozinho.curte();
        joaozinho.reproduzir();
        joaozinho.calculaClassificacao();

        PodCast carcarro = new PodCast("Marcelo Car", "carros e afins", 120,"Opala melhor que Maverick", "Podcast automotivo" );
        carcarro.setCurtidas(30);
        carcarro.setVisualizacoes(30);
        carcarro.reproduzir();
        

        PodCast various = new PodCast("Manu Manuela", "Viagens no Mundo", 45,"Tudo sobre Nova Yorque", "Podcast sobre viagens");
        various.setCurtidas(60);
        various.setVisualizacoes(60);
        various.reproduzir();
        various.calculaClassificacao();

        Musica one = new Musica("Metallica", "One", 6, "...And Justice For All", "Metal");
        one.setCurtidas(120);
        one.setVisualizacoes(120);
        one.curte();
        one.reproduzir();
        one.calculaClassificacao();


    }
}
