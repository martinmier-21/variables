


import java.util.Scanner;

public class ejercicio4 {



    public static void main(String[] args) {
        String capital;
        String pais;



        Scanner input= new Scanner(System.in);
        System.out.println("bienvenido");

        System.out.println("ingrese ciudad capital");
        capital= input.nextLine();

        System.out.println("ingrese pais");
        pais= input.nextLine();




        System.out.println("La "+"ciudad "+capital+ " es capital del pais "+pais+"" );
    }
}