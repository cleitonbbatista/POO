package ads.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public boolean addContato(String nome, String sobrenome, String dataNasc) {
        Contato contato = new Contato(nome, sobrenome, dataNasc);
        if (contatos.contains(contato)) {
            return false;
        } else {
            this.contatos.add(contato);
            return true;
        }
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        ArrayList<Contato> resultados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome) && contato.getSobrenome().equals(sobrenome)) {
                resultados.add(contato);
            }
        }
        return resultados;
    }

    public boolean removeContato(int indiceContatoNaLista) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.remove(indiceContatoNaLista);
            return true;
        } else {
            return false;
        }
    }

    public boolean addTelefone(int indiceContatoNaLista, String rotulo, String valor) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).addTelefone(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeTelefone(int indiceContatoNaLista, String rotulo) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).removeTelefone(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateTelefone(int indiceContatoNaLista, String rotulo, String valor) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).updateTelefone(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean addEmail(int indiceContatoNaLista, String rotulo, String valor) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).addEmail(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeEmail(int indiceContatoNaLista, String rotulo) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).removeEmail(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmail(int indiceContatoNaLista, String rotulo, String valor) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            this.contatos.get(indiceContatoNaLista).updateEmail(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos= " + contatos + "]";
    }

}
