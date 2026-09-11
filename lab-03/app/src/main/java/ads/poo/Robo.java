package ads.poo;

public class Robo {

    private String nome;
    private static int cont;
    private int id;
    private boolean estado;

    public Robo(String nome, boolean estado) {
        this.nome = nome;
        this.id = cont;
        cont++;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public boolean isLigado() {
        return estado;
    }

    public boolean ligaDesliga() {
        this.estado = !estado;
        return this.estado;
    }

}
