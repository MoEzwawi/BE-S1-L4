package entities;

public class GestioneDipendenti {
    public static void main(String[] args){
        Dipendente operaio1 = new Dipendente("001",Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("002",Dipartimento.PRODUZIONE);
        Dipendente impiegato1 = new Dipendente("003",1200,30,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente1 = new Dipendente("004",2000,30,Livello.DIRIGENTE,Dipartimento.VENDITE);

        operaio1.promuovi();
        impiegato1.promuovi();

        operaio1.stampaDatiDipendente();
        double stipendioOperaio1 = Dipendente.calcolaPaga(operaio1,5);
        System.out.println("Stipendio comprensivo di straordinari: "+ stipendioOperaio1);

        operaio2.stampaDatiDipendente();
        double stipendioOperaio2 = Dipendente.calcolaPaga(operaio2,5);
        System.out.println("Stipendio comprensivo di straordinari: "+ stipendioOperaio2);

        impiegato1.stampaDatiDipendente();
        double stipendioImpiegato1 = Dipendente.calcolaPaga(impiegato1,5);
        System.out.println("Stipendio comprensivo di straordinari: "+ stipendioImpiegato1);

        dirigente1.stampaDatiDipendente();
        double stipendioDirigente1 = Dipendente.calcolaPaga(dirigente1,5);
        System.out.println("Stipendio comprensivo di straordinari: "+ stipendioDirigente1);

        double sommaStipendiDovuti = stipendioOperaio1 + stipendioOperaio2 + stipendioImpiegato1 + stipendioDirigente1;
        System.out.println("Gli stipendi dovuti in questo mese ammontano a: " + sommaStipendiDovuti);
    }
}
