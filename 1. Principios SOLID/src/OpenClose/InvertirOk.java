package OpenClose;

public class InvertirOk {

    private IActivoFinanciero[] activoFinanciero = new IActivoFinanciero[2];

    public void EsHoradeInvertir(IActivoFinanciero[] activoFinanciero){
        for(int i = 0; i < activoFinanciero.length; i++){
            activoFinanciero[i].EsHoraDeInvertir();
        }
    }
}
