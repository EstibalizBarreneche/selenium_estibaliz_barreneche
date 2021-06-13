import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args []) {
        System.out.println("Bienvenido al programa");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = teclado.nextInt();
        int doble = retornarDoble(num);
        System.out.println("El doble de " + num + " es " + doble);

        System.out.println("El programa ha finalizado");

    }

    public static int retornarDoble(int numero) {
        return numero*2;
    }
}
