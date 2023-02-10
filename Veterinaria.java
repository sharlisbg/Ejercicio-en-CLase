import java.util.*;

public class Veterinaria {
    ArrayList<Mascota> mascotas; 


    public Veterinaria() {
        this.mascotas = new ArrayList<Mascota>();
        Perro perro1 = new Perro("Pancho", "Poodle", 2);
        mascotas.add(perro1);
        Gato gato1 = new Gato("Mish", "Persa", 5);
        mascotas.add(gato1);
        }

}