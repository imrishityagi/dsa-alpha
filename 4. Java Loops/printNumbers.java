import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args) {
        // print numbers 1 to 10 using while loop

        int counter = 1;
        // print numbers 1 to 10
        // while(counter <= 10) {
        //     System.out.println(counter);
        //     counter += 1;
        // }
        
        // print numbers 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while(counter <= n) {
            System.out.println(counter);
            counter += 1;
        }

        // print sum of numbers from 1 to n
        int num = sc.nextInt();
        int range = 1;
        int sum = 0;
        while(range <= num) {
            sum = sum + range;
            range = range + 1;
        }
        System.out.println(sum);
        sc.close();
    }
}
