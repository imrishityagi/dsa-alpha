public class largestOfThree {
    public static void main(String[] args) {
        int a = 233;
        int b = 23;
        int c = 17;
        if(a > b && a > c) {
            System.out.println("a is largest");
        }
        else if(b > c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }
}
