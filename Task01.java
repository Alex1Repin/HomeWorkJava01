import java.util.Scanner;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n)
public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введите число ->");
        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();
        int res = sum(name);
        System.out.println(res);
    }
    public static int sum(int n){
        return n*(n+1)/2;
    }
}
