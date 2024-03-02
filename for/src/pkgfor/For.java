/*Buatlah algoritma dalam bahasa Java, mengulang menuliskan teks “Saya senang belajar
bahasa Java” sebanyak N kali, dengan nilai N yang akan dibaca dengan perintah inputan
menggunakan perulangan for.*/

package pkgfor;

import java.util.Scanner;
public class For {

    public static void main(String[] args) {
       Scanner forrr = new Scanner(System.in);
               
            System.out.print("Masukkan angka : ");
            int N=forrr.nextInt();
            
            int i;
            
                for (i = 0; i<N;i++){
                    System.out.println("Saya senang belajar bahasa java");
                }
                
        forrr.close();
    }
    
    
}
