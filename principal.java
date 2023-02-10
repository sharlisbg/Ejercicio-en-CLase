import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido a la veterinaria");
		System.out.println("Ingrese el nombre de su mascota");
		String name = in.nextLine();
		System.out.println("Ingrese la raza de su mascota");
        String raza = in.nextLine();
        System.out.println("Ingrese la edad de su mascota");
        int edad = in.nextInt();
        in.nextLine();
        
    }
}