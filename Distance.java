 import java.util.Scanner;

    public class Distance {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter x: ");
            int x = s.nextInt();
            System.out.print("Enter y: ");
            int y = s.nextInt();

            double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            System.out.printf("Distance is %.2f", distance);

        }
    }