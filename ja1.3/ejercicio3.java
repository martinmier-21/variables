


import java.util.Scanner;

public class ejercicio3 {



    public static void main(String[] args) {
        String nombre;
        String apellido;
        String nombrepadre;
        String apellidopadre;
        String nombremadre;
        String apellidomadre;


        Scanner input= new Scanner(System.in);
        System.out.println("bienvenidos");

        System.out.println("¿cual es tu nombre?");
        nombre= input.nextLine();

        System.out.println("¿cual es tu apellido?");
        apellido= input.nextLine();

        System.out.println("¿cual es el nombre de tu padre?");
        nombrepadre= input.nextLine();

        System.out.println("¿cual es el apellido de tu padre?");
        apellidopadre= input.nextLine();

        System.out.println("¿cual es el nombre de tu madre?");
        nombremadre= input.nextLine();

        System.out.println("¿cual es el apellido de tu madre?");
        apellidomadre= input.nextLine();



        System.out.println("Yo "+"soy "+nombre+ " "+apellido+" soy hijo de " +nombrepadre+" " +apellidopadre+ " y de " +nombremadre+ " " +apellidomadre+ ""  );
    }
}