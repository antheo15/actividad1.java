public class Coche {

    public static void main (String args[]) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        System.out.println("El coche tiene un total de "+ miCoche.puertas + " puertas");

    }
    public int puertas = 4;
    public void agregarPuerta(){
        this.puertas++;
    }
}
