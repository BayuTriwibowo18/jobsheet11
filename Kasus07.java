public class Kasus07 {
    public static void main(String[] args) {
        int outer = 1;

        while (outer <= 3) {
            int inner = 1;

            while (inner <= 5) {
                System.out.print(outer + "-" + inner + " ");
                inner++;
            }

            System.out.println(); 
            outer++;
        }
    }
}