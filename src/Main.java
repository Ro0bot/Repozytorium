import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char oper;
        double num1;
        double num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Num1");
        num1 = input.nextDouble();
        System.out.println("Znak: +, -, *, /");
        oper = input.next().charAt(0);
        System.out.println("Num2");
        num2 = input.nextDouble();
        switch (oper) {
            case '+':
                System.out.println("Wynik: "+(num1 + num2));
                break;
            case '-':
                System.out.println("Wynik: "+(num1 - num2));
                break;
            case '*':
                System.out.println("Wynik: "+(num1 * num2));
                break;
            case '/':
                System.out.println("Wynik: "+(num1 / num2));
                break;
            default:
                System.out.println("Zly Znak");
                break;
        }
        input.close();
    }
}