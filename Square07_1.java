import java.util.Scanner;
public class Square07_1  {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = sc07.nextInt();

        for(int iOuter = 0; iOuter <= N; iOuter++){
            for(int i =1; i <= N; i++){
            System.out.print("*");
        }
            System.out.println();
        }

    }
    
}
