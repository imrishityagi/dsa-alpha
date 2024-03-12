public class Ifelse {
    public static void main(String[] args) {
        int age = 17;
        if(age >= 18) {
            System.out.println("You are eligible to vote");
        }
        if(age > 13 && age < 18) {  // we can write multiple if
            System.out.println("Vote after some years");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println();
    }
}
