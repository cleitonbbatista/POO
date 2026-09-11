package ads.poo;

public class Ponto {

    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto (x=" + x + ", y=" + y + ")";
    }

    public double distancia(Ponto outro) {
        return Math.sqrt(Math.pow((outro.x - this.x),2) + Math.pow((outro.y - this.y),2));
    }

}
