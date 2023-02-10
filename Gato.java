public class Gato extends Mascota{

    public Gato(String nombre, String raza, int edad) {
        super( nombre, raza, edad);
    }

    public void servicio(){
        System.out.println("El gato debe ir a la sala 1");
        System.out.println("El costo del servicio es de Q 300.00 ");
    }

    
}