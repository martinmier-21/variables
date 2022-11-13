


import java.util.Scanner;

public class ejercicio2 {



    public static void main(String[] args) {
        String nombre;
        String apellido;


        Scanner input= new Scanner(System.in);
        System.out.println("bienvenidos");

        System.out.println("¿cual es tu nombre?");
        nombre= input.nextLine();

        System.out.println("¿cual es tu apellido?");
        apellido= input.nextLine();

        System.out.println("Hola "+nombre+ " "+apellido);


    }
}