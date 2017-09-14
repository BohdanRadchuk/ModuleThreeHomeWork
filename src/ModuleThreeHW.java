import java.util.Scanner;

public class ModuleThreeHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива ");
        int x = scanner.nextInt();

        int[] a = new int[x];


        for (int i = 0; i < a.length; i++) {
            System.out.print("введите " + (i + 1) + "-е значение массива -");
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        int min = a[0];
        int num5 = 0;

        for (int i = 0; i<a.length; i++) {

            System.out.print(a[i] + ", ");

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) min=a[i];
            if (a[i] == 5) num5++;
        }
        System.out.printf("Максимальное значение = %d Минимальное значение = %d; \n 5 повторялась %d раз", max, min, num5);

    }
}
