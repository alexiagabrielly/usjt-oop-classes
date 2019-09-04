// Escreva um programa que pede para o usuário o tamanho de uma sequência e pede para que digite os número que completem essa sequência, e ao final diga quantos números pares e quantos números impares foram digitados.

package class1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o tamanho da sequ�ncia");
        int n = s.nextInt();
        int i = 0;
        int pares = 0;
        int impares = 0;

        while (i < n) {
            System.out.println("digite um n�mero");
            i = i +1;
            int x = s.nextInt();
            if (x % 2 == 0) {
                pares = pares +1;
            } else {
                impares = impares +1;
            }

        }
        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);
    }
}
