package entities;

public class Dipendente {
    public static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario= 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }
    public void stampaDatiDipendente(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
    public void promuovi(){
        switch (this.livello){
            case OPERAIO -> this.livello = Livello.IMPIEGATO;
            case IMPIEGATO -> this.livello = Livello.QUADRO;
            case QUADRO -> this.livello = Livello.DIRIGENTE;
            case DIRIGENTE -> System.err.println("Il dipendente "+ this.matricola + " è già un dirigente.");
        }
    }
}
