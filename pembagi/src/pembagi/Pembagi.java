/*Buatlah algoritma dalam bahasa Java, menghitung Pembagi Bersama Terbesar dari dua
buah bilangan a dan b yang diinput dari alat masukan.*/
package pembagi;

import java.util.Scanner;
public class Pembagi {

    static int hitung(int a, int b){
        while (b != 0 ){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner pembagi = new Scanner (System.in);
        
        System.out.print("Masukan angka : ");
        int a =pembagi.nextInt();
        System.out.print("Masukan angka : ");
        int b =pembagi.nextInt();
        
        int pbt = hitung(a, b);
        
        System.out.println("Pembagi dari : " + a + " dan " + b + " = " + pbt);
    }
    
}
