public class Main {
    public static void main(String[] args) {

        int numero1 = 12;
        int numero2 = 30;
        int numero3 = 55;
        int resultado = suma(numero1,numero2,numero3);
        System.out.println(resultado);

        Coche coche1 = new Coche();
        coche1.agregarPuerta();
        System.out.println(coche1.puertas);

    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }


}

class Coche {
    public int puertas = 0;

    public void agregarPuerta() {
        this.puertas++;
    }
}

