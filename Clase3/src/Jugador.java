import java.util.Scanner;

public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numero_camiseta;

    public Jugador(String nombre, String posicion, int edad, int numero_camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero_camiseta = numero_camiseta;
    }

    public void datos() {
        System.out.println("*********************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numero_camiseta);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Jugador 3
        System.out.println("\nIngrese los datos del jugador 3:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Posición: ");
        String posicion = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Número de camiseta: ");
        int numero = sc.nextInt();
        Jugador jugador3 = new Jugador(nombre, posicion, edad, numero);
        jugador3.datos();
        // Jugador 1 y 2 con datos quemados
        Jugador jugador1 = new Jugador("Luis Martinez", "Delantero", 24, 9);
        jugador1.datos();
        Jugador jugador2 = new Jugador("Carlos Perez", "Defensa", 28, 4);
        jugador2.datos();

    }
}
