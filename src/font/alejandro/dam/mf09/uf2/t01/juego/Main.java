package font.alejandro.dam.mf09.uf2.t01.juego;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Boeing 747", 5, 150, 100, 245, 300);
        Avion avion2 = new Avion("Airbus 240", 10, 245, 150, 300, 100);
        Avion avion3 = new Avion("Boeing 850", 7, 100, 300, 150, 245);
        Avion avion4 = new Avion("Airbus 150", 15, 300, 245, 100, 150);

        avion1.start();
        avion2.start();
        avion3.start();
        avion4.start();
    }
}
