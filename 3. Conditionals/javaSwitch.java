public class javaSwitch {
    public static void main(String args[]) {
        int number = 2;
        switch (number) {
            case 1: System.out.println("samosa");
            break;
            case 2: System.out.println("cola");
            break;
            case 3: System.out.println("juice");
            break;
            default: System.out.println("You will get nothing!");
        }
        // also we can do this:
        char ch = 'a';
        switch (ch) {
            case 'd': System.out.println("samosa");
            break;
            case 'a': System.out.println("cola");
            break;
            case 'f': System.out.println("juice");
            break;
            default: System.out.println("You will get nothing!");
        }
    }
}
