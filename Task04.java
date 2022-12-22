import java.util.Scanner;
/*Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию,
 которую надо выполнить с этими числами"... "ответ: ...")
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        System.out.println("Введите число 1->");
        int number01 = scanner01.nextInt();
        System.out.println("Введите число 2->");
        Scanner scanner02 = new Scanner(System.in);
        int number02 = scanner02.nextInt();
        System.out.println("Введите знак (+ - * /) ->");
        Scanner scanner03 = new Scanner(System.in);
        String sing = scanner03.nextLine();
        int res=0;
        if (sing == "+") {
            res = sum(number01, number02);
        } else if (sing == "-") {
            res = diff(number01, number02);
        } else if (sing == "*") {
            res = multi(number01, number02);
        } else if (sing == "/") {
            res = divis(number01, number02);
        }

        System.out.println("Ответ " + res);


    }
    public static int sum(int a, int b){
        return (a+b);
    }
    public static int diff(int a, int b){
        return (a-b);
    }
    public static int multi(int a, int b) {
        return (a * b);
    }
    public static int divis(int a, int b) {
        return (a + b);
    }
}