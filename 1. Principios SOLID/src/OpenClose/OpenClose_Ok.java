package OpenClose;

import java.util.ArrayList;
import java.util.Scanner;

public class OpenClose_Ok {
    public static void main(String[] args) {

        Nasdaq100_Ok nasdaq100_ok = new Nasdaq100_Ok();
        SP500_Ok sp500_ok = new SP500_Ok();
        IActivoFinanciero[] activoFinancieros = new IActivoFinanciero[2];
        InvertirOk invertirOk = new InvertirOk();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio máximo historico del Nasdaq100");
        nasdaq100_ok.setMaxHisto(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("Precio de cierre Hoy Nasdaq100");
        nasdaq100_ok.setClosePrice(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("Precio máximo historico del SP500");
        sp500_ok.setMaxHisto(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("Precio de cierre Hoy SP500");
        sp500_ok.setClosePrice(scanner.nextFloat());
        scanner.nextLine();

        activoFinancieros[0] = nasdaq100_ok;
        activoFinancieros[1] = sp500_ok;

        invertirOk.EsHoradeInvertir(activoFinancieros);

    }
}
