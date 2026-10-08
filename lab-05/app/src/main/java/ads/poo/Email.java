package ads.poo;

public class Email {

    private String valor;
    private String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public Email(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        } else {
            return;
        }
        
    }

    public String toString() {
        return valor;
    }

}
