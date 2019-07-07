 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        int a=1;
        int b=48;
        while (true) {
            System.out.print("input :");
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            b += a + value + (4);
            a = b - value*2 ;
            if (b > a) {
                System.out.println("very good");
            } else {
                System.out.println("very bad");
            }
        }
    }
}
