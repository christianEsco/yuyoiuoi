package login2;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numCuenta = {11, 12, 13};
        String [] persona = {"odeth","paco","Roger",""};
        int numero,pos = 0;
        System.out.println("Ingrese numero de cuenta ");
        numero = in.nextInt();
        for (int i = 0; i < 3; i++) {
            if (numCuenta[i] == numero) {
                System.out.println("El numero es igual ");
                pos = i;
                i = 3;
                
                
                
            } else if (i == 2) {
                i=3;
                pos = i;
                System.out.println("Incorrecto");
            }
        }
        System.out.println(persona[pos]);
           
    }

}
