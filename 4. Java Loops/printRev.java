public class printRev {
    public static void main(String[] args) {

        // print reverse of a number
        int num = 10899;   // this will become 0 after all the iterations
        while(num > 0) {
            int last = num % 10;      // this gives us last digit of a number
            System.out.print(last);
            num = num / 10;           // this removes the last digit from a number
        }

        System.out.println();
        // reverse the given number
        int n = 10899;    // this will become 0 after all the iterations
        int rev = 0;
        while(n > 0) {
            int last = n % 10;       // this gives us last digit of a number
            rev = (rev * 10) + last; // this appends the last digit into an empty variable
            n = n / 10;              // this removes the last digit from a number
        }
        System.out.println(rev);
        System.out.println(num);
        System.out.println(n);
    }
}
