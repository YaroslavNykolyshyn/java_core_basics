import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть кількість елементів ");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Введіть число ");
        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Введіть число в зворотньому порядку ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);

        }
    }
}
