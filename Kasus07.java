import java.util.Scanner;

public class Kasus07 {
     public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        int[][] namaBarang = new int[3][7];
        int[] jmlTerbanyak = new int[3];
        int totalTerjual = 0;
          

        System.out.println("========================================");
        System.out.println("=====SELAMAT DATANG DI TOKO ADIBAYU=====");
        System.out.println("========================================");
        for (int i = 0; i < namaBarang.length; i++) { 
            System.out.println("barang ke " + (i+1));
            int total = 0; 
            for (int j = 0; j < namaBarang[0].length; j++) { 
                System.out.print("hari ke " +(j +1) + " Terjual : "); 
                namaBarang[i][j] = sc07.nextInt(); 
                total += namaBarang[i][j];
                totalTerjual += namaBarang[i][j];
            } 
            jmlTerbanyak[i] = total;
            System.out.println("------------------------------------------"); 
           } 
        for (int i = 0; i < namaBarang.length; i++) { 
            System.out.print("barang ke " + (i+1) + ": "); 
            for (int j = 0; j < namaBarang[i].length; j++) { 
                System.out.print(namaBarang[i][j] + " "); 
            } 
            System.out.println(" / jumlah " + jmlTerbanyak[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Jumlah barang yang laku pada minggu ini " +totalTerjual);
    }
}