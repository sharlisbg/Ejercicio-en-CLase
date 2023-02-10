public class Perro extends Mascota{


    public Perro(String nombre, String raza, int edad) {
        super( nombre, raza, edad);
    }
    

    public void servicio(){
        System.out.println("El perro debe ir a la sala 1");
        System.out.println("El costo del servicio es de Q 150.00 ");
    }
}