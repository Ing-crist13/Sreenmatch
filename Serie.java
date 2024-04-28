package br.com.alura.screenmacth.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private  int episodioPorTemporadas;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodioPorTemporadas(int episodioPorTemporadas) {
        return episodioPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodioPorTemporadas(int episodioPorTemporadas) {
        this.episodioPorTemporadas = episodioPorTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
     @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodioPorTemporadas * minutosPorEpisodio;



    }
}
