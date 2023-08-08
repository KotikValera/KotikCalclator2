import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        System.out.println("Output:\n" + Main.calc(input));
    }
}
class Main {
    public static String calc(String input) {
        String exception = "throws Exception";
        String[] elements = input.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        int result;
        if (elements.length != 3){
            return exception;
        }
        if ((num1 < 0) || (num1 > 10) || (num2 < 0) || (num2 > 10)) {
            return exception;
        }
        String sign = elements[1];
        switch (sign) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> {
                return "Invalid operator";
            }
        }
        return String.valueOf(result);
    }
}