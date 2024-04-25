package br.alura.desafioMusica.app;

public class Audio {
    public Audio(String autor, String titulo, int duracao) {
        this.autor = autor;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    String autor;
    String titulo;
    int duracao;
    int curtidas;
    int visualizacoes;

    //Setter para testes
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void curte(){
        curtidas++;
        System.out.println("Faixa Adicionada aos favoritos!\n");
    }

}
