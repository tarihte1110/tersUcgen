import java.util.Scanner;
public class tersUcgen {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Üçgeniniz kaç basamaktan oluşsun:");
        int bas= input.nextInt();

        System.out.println("\nÜÇGENİNİZ:");
        System.out.println();

        for (int x = bas ; x >= 1; x--) {

            for (int d = 1; d <= (bas - x) ; d++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= (2 * x) - 1  ; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
