import java.util.Scanner;
// Вычислить n! (произведение чисел от 1 до n)
public class Task002 {


    public static void main(String[] args) {
        System.out.println("Введите число ->");
        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();
        int res = multi(name);
        System.out.println(res);
    }
    public static int multi(int n) {
        int mult = 1;
        while (n > 1) {
            mult *= n;
            n -= 1;
        }
        return mult;
    }
}