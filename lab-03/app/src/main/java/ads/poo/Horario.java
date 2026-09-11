package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;
    private String[] ext = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
            "dezenove", "vinte", "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro",
            "vinte e cinco", "vinte e seis", "vinte e sete", "vinte e oito", "vinte e nove",
            "trinta", "trinta e um", "trinta e dois", "trinta e três", "trinta e quatro",
            "trinta e cinco", "trinta e seis", "trinta e sete", "trinta e oito",
            "trinta e nove", "quarenta", "quarenta e um", "quarenta e dois",
            "quarenta e três", "quarenta e quatro", "quarenta e cinco",
            "quarenta e seis", "quarenta e sete", "quarenta e oito",
            "quarenta e nove", "cinquenta", "cinquenta e um", "cinquenta e dois",
            "cinquenta e três", "cinquenta e quatro", "cinquenta e cinco",
            "cinquenta e seis", "cinquenta e sete", "cinquenta e oito",
            "cinquenta e nove", "sessenta"};

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        if (hora < 0 || hora > 23) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 23) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public String horaExtenso(){
        return ext[hora] + " horas, " + ext[minuto] + " minutos e " + ext[segundo] + " segundos.";
    }
    
    public long toSec(){
        return hora * 3600 + minuto * 60 + segundo;
    }

    public long difHorario(Horario outro){
        return Math.abs(this.toSec() - outro.toSec());
    }
}
