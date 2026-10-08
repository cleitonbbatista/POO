package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones = new HashMap<>();
    private HashMap<String, Email> emails = new HashMap<>();

    private String eR = "^[0-9]{8,8}+$";
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Contato(String nome, String sobrenome, String dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (dataNasc.matches(eR)) {
            this.dataNasc = LocalDate.parse(dataNasc, formato);
        } else {
            return;
        }
    }

    public boolean addTelefone(String rotulo, String valor){
        if (telefones.containsKey(rotulo)) {
            return false;
        } else {
            telefones.put(rotulo, new Telefone(valor));
            return true;
        }     
    }

    public boolean removeTelefone(String rotulo){
        if (telefones.containsKey(rotulo)) {
            telefones.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String valor){
        if (telefones.containsKey(rotulo)) {
            telefones.put(rotulo, new Telefone(valor));
            return true;
        }  else {
            return false;
        }
    }

    public boolean addEmail(String rotulo, String valor){
        if (emails.containsKey(rotulo)) {
            return false;
        } else {
            emails.put(rotulo, new Email(valor));
            return true;
        }     
    }

    public boolean removeEmail(String rotulo){
        if (emails.containsKey(rotulo)) {
            emails.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String valor){
        if (emails.containsKey(rotulo)) {
            emails.put(rotulo, new Email(valor));
            return true;
        }  else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }

}
