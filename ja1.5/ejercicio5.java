


import java.util.Scanner;

public class ejercicio5 {



    public static void main(String[] args) {
        String mascota;
        String edad;
        String tipo;
        String nombre;


        Scanner input= new Scanner(System.in);
        System.out.println("bienvenido");

        System.out.println("nombre de su mascota");
        mascota= input.nextLine();

        System.out.println("tipo de mascota");
        tipo= input.nextLine();

        System.out.println("edad");
        edad= input.nextLine();



        System.out.println("nombre completo");
        nombre= input.nextLine();




        System.out.println( mascota +   " es un(a) "+tipo+ ", el cual tiene "+edad+" años y "+nombre+ " es actualmente su dueño(a)."

        );
    }
}