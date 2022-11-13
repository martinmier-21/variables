


import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        int altura;

        Scanner input= new Scanner(System.in);
        System.out.println("bienvenidos");

        System.out.println("¿cual es tu nombre?");
        nombre= input.nextLine();

        System.out.println("¿cual es tu apellido?");
        apellido= input.nextLine();


        System.out.println("¿cual es tu edad?");
        edad=input.nextInt();

        System.out.println("¿cual es tu altura?");
        altura=input.nextInt();

        System.out.println("Hola "+nombre+ " "+apellido+" tienes "+edad+" años y mides " +altura+ " CM");

    }
}
