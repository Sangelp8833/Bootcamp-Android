package OpenClose;

public class Invertir {
    private Nasdaq100 nasdaq100;

    public Invertir(Nasdaq100 nasdaq100){
        this.nasdaq100 = nasdaq100;
    }

    public void EsHoradeInvertir(){
        if ((nasdaq100.getMaxHisto() - nasdaq100.getClosePrice())/100 > 4){
            System.out.println("Es hora de invertir en el Nasdaq100");
        }

    }

    // Que pasa si no queremos calcular el momento exacto para invetir en el Nasdaq100 si no
    // que queremos invertir en el SP500, la formula para invetir en el SP 500 es distinta a la formula del Nasdaq100
    // por lo tanto tendríamos que modificar la función " EsHoraDeInvertir ", violando así el principio Open/Close.
}
