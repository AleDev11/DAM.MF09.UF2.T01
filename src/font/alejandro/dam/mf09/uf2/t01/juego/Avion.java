package font.alejandro.dam.mf09.uf2.t01.juego;

public class Avion extends Thread {

    private String marcaAvion;
    private int frecuenciaSegundosAparicion;
    private int LimiteHorizontalPantalla;
    private int LimiteVerticalPantalla;
    private int LimiteMenorProfundidad;
    private int LimiteMayorProfundidad;

    public Avion(String marcaAvion, int frecuenciaSegundosAparicion, int limiteHorizontalPantalla, int limiteVerticalPantalla, int limiteMenorProfundidad, int limiteMayorProfundidad) {
        this.marcaAvion = marcaAvion;
        this.frecuenciaSegundosAparicion = frecuenciaSegundosAparicion;
        LimiteHorizontalPantalla = limiteHorizontalPantalla;
        LimiteVerticalPantalla = limiteVerticalPantalla;
        LimiteMenorProfundidad = limiteMenorProfundidad;
        LimiteMayorProfundidad = limiteMayorProfundidad;
    }

    public String getMarcaAvion() {
        return marcaAvion;
    }

    public void setMarcaAvion(String marcaAvion) {
        this.marcaAvion = marcaAvion;
    }

    public int getFrecuenciaSegundosAparicion() {
        return frecuenciaSegundosAparicion;
    }

    public void setFrecuenciaSegundosAparicion(int frecuenciaSegundosAparicion) {
        this.frecuenciaSegundosAparicion = frecuenciaSegundosAparicion;
    }

    public int getLimiteHorizontalPantalla() {
        return LimiteHorizontalPantalla;
    }

    public void setLimiteHorizontalPantalla(int limiteHorizontalPantalla) {
        LimiteHorizontalPantalla = limiteHorizontalPantalla;
    }

    public int getLimiteVerticalPantalla() {
        return LimiteVerticalPantalla;
    }

    public void setLimiteVerticalPantalla(int limiteVerticalPantalla) {
        LimiteVerticalPantalla = limiteVerticalPantalla;
    }

    public int getLimiteMenorProfundidad() {
        return LimiteMenorProfundidad;
    }

    public void setLimiteMenorProfundidad(int limiteMenorProfundidad) {
        LimiteMenorProfundidad = limiteMenorProfundidad;
    }

    public int getLimiteMayorProfundidad() {
        return LimiteMayorProfundidad;
    }

    public void setLimiteMayorProfundidad(int limiteMayorProfundidad) {
        LimiteMayorProfundidad = limiteMayorProfundidad;
    }

    public void run(){
        while(true){
            int x = (int) (Math.random() * LimiteHorizontalPantalla);
            int y = (int) (Math.random() * LimiteVerticalPantalla);
            int z = (int) (Math.random() * LimiteMayorProfundidad + LimiteMenorProfundidad);
            System.out.println("El avión " + marcaAvion + " aparecerá en la posición x: " + x + " y: " + y + " z: " + z);
            try {
                Thread.sleep(frecuenciaSegundosAparicion * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
