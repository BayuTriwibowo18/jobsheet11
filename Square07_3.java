import java.util.Scanner;
public class Square07_3 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = sc07.nextInt();

        for(int iOuter = 1; iOuter <= N; iOuter++){
            for(int i =0; i <= N; i++){
            System.out.print("*");
        }
        
        }

    }
    
}
