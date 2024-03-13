public class breakContinue {
    public static void main(String[] args) {
        // break is used to get out of loop means it terminates the execution and get out of loop
        for(int i=1; i<=5; i++) {
            if(i==3) {
                System.out.println("loop terminated at: " + i);
                break;
            }
            System.out.println(i);
        }
        
        // continue statement is used to pass the specific condition means it basically skips the condition
        for(int i=1; i<=5; i++) {
            if(i==3) {
                System.out.println("loop skipped the number: " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
