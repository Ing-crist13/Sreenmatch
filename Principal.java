import br.com.alura.screenmacth.calculo.CalculadoraTempo;
import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(6);
        filme1.avalia(8);
        filme1.avalia(9.5);
        System.out.println("Total de avaliaçoes: " + filme1.getTotalDeAvalicoes());

        System.out.println(filme1.obtemMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporadas(15);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duraçao para maratonar LOST: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.incluir(filme1);
        calculadora.incluir(filme2);
        calculadora.incluir(lost);
        System.out.println(calculadora.getTempoTotal());






       }
    }
