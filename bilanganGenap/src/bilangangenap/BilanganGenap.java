/*Buatlah algoritma dalam bahasa Java, menampilkan jumlah deret bilangan genap dari
batasAwal dan batasAkhir yang diinput dari alat masukan.*/

package bilangangenap;

import java.util.Scanner;
public class BilanganGenap {
    
    public static void main(String[] args) {
        Scanner bilanganGenap = new Scanner (System.in);
        
        System.out.print("Masukkan batas awal : ");
        int batasAwal = bilanganGenap.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = bilanganGenap.nextInt();
        
        int jumlah=0;
        
        for (int i = batasAwal;i<=batasAkhir;i++){
            if (i % 2 == 0){
                System.out.println(i);
                jumlah++;
            }
        }
        
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " yaitu ada : " + jumlah);
        
        bilanganGenap.close();
    }
    
}
