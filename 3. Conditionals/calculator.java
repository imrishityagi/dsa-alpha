public class calculator {
    public static void main(String[] args) {
        char Op = '/';
        int num1 = 20;
        int num2 = 10;
        int result = 0;
        switch(Op) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default: System.out.println("Invalid Operator");
        }
        System.out.println(result);
    }
}
