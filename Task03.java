import java.util.Scanner;
/* Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только
 на себя и на единицу без остатка. Чтобы найти остаток от деления используйте оператор % ,
  например 10%3 будет равно единице)
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите положительное число->");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i < number+1; i++) {
            if (reverso(i))
                System.out.println(i);
        }
    }

    public static boolean reverso(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}