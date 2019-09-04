//Escreva um programa que lê um int n >= 1, e uma sequência  de n int's e determina o maior elemento da sequência.

package class1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o tamanho da sequ�ncia");
        int n = s.nextInt();
        int i = 0;
        int max = Integer.MIN_VALUE;

        while (i <= n) {
            i = i +1;
            System.out.println("digite outro n�mero");
            int x = s.nextInt();
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
