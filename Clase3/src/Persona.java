public class Persona {
    int cedula;
    int edad;
    String nombre;
    String correo;
    public Persona(int cedula, int edad, String nombre, String correo){
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void impresion(){
        System.out.println("BIENVENIDO");
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Nombre: "+nombre);
        System.out.println("Correo: "+correo);
        System.out.println("------------------------------");
    }

    public static void main(String[] args){
        Persona objeto1 = new Persona(1756236806, 20, "Camila Bueno", "camibueno@gmail.com");
        objeto1.impresion();
        Persona objeto2 = new Persona(1751254152, 22, "Martina Lopez", "martilop@gmail.com");
        objeto2.impresion();
    }
}