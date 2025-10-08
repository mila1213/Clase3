import java.util.Scanner;

public class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fecha_ingreso;

    public Empleado(String nombre, String cargo, double salario, String fecha_ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }
    public void datos(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = ingreso.nextLine();
        System.out.println("Ingrese el cargo del empleado: ");
        cargo = ingreso.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        salario = ingreso.nextDouble();
        ingreso.nextLine(); // Limpia el buffer
        System.out.println("Ingrese la fecha de ingreso del empleado: ");
        fecha_ingreso = ingreso.nextLine();

        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Cargo del empleado: "+cargo);
        System.out.println("Salario del empleado: "+salario);
        System.out.println("Fecha de ingreso: "+fecha_ingreso);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("","",0.00 ,"" );
        empleado1.datos();
        Empleado empleado2 = new Empleado("","",0.00 ,"" );
        empleado2.datos();
        Empleado empleado3 = new Empleado("","",0.00 ,"" );
        empleado3.datos();
    }
}