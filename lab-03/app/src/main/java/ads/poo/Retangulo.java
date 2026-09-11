package ads.poo;

public class Retangulo {

    private double largura;
    private double altura;
    private String cod;

    public Retangulo(double largura, double altura, String cod) {
        if (largura <= 0 || altura <= 0) {
            this.largura = 4;
            this.altura = 3;
        } else {
            this.largura = largura;
            this.altura = altura;
        }
        if (cod == "ASCII" || cod == "UTF8") {
            this.cod = cod;
        } else {
            this.cod = "ASCII";
        }
    }
    
    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        this.cod = "ASCII";
    }

    public boolean setLargura(double largura) {
        if (largura <= 0) {
            this.largura = 4;
            return false;
        } else {
            this.largura = largura;
            return true;
        }
    }

    public boolean setAltura(double altura) {
        if (altura <= 0) {
            this.altura = 3;
            return false;
        } else {
            this.altura = altura;
            return true;
        }
    }

    public boolean setCod(String cod) {
        if (cod == "ASCII" || cod == "UTF8") {
            this.cod = cod;
            return true;
        } else {
            this.cod = "ASCII";
            return false;
        }
    }
    
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String getCod() {
        return cod;
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (this.cod == "ASCII") {
            sb.append("+");
            for (int i = 0; i < this.largura-2; i++) {
                sb.append("-");
            }
            sb.append("+\n");

            for(int i = 0; i < this.altura-2; i++) {
                sb.append("|");
                for (int j = 0; j < this.largura-2; j++) {
                    sb.append(" ");
                }
                sb.append("|\n");
            }

            sb.append("+");
            for (int i = 0; i < this.largura-2; i++) {
                sb.append("-");
            }
            sb.append("+");
        } else {
            sb.append('\u250C');
            for (int i = 0; i < this.largura-2; i++) {
                sb.append('\u2500');
            }
            sb.append('\u2510');
            sb.append('\n');
            for(int i = 0; i < this.altura-2; i++) {
                sb.append('\u2502');
                for (int j = 0; j < this.largura-2; j++) {
                    sb.append(" ");
                }
                sb.append('\u2502');
                sb.append('\n');
            }
            sb.append('\u2514');
            for (int i = 0; i < this.largura-2; i++) {
                sb.append('\u2500');
            }
            sb.append('\u2518');
        }
        return sb.toString();
    }
    
}
