public class RefugioVet{

    public Mascota getMascota(String nombre, String raza, int edad) {
        Mascota mymascota;
        if (nombre.equals("Pancho") && raza.equals("Poodle")){
            mymascota = new Perro(nombre, raza, edad);
        }
        if (nombre.equals("Mish") && raza.equals("Persa")){
            mymascota = new Gato(nombre, raza, edad);
        }
    }


}