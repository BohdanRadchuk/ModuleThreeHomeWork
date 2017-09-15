import java.util.Scanner;

public class ModuleThreeHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива ");
        int x = scanner.nextInt();

        int[] a = new int[x];                           //задаем размер масива


        for (int i = 0; i < a.length; i++) {
            System.out.print("введите " + (i + 1) + "-е значение массива -");
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        int min = a[0];
        int num5 = 0;

        for (int i = 0; i<a.length; i++) {              // ищем макс, мин и количество 5-ок

            System.out.println(a[i] + "; ");              //не можем начать смотреть цикл с а[1] из-за этого

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) min=a[i];
            if (a[i] == 5) num5++;
        }
        System.out.printf("Максимальное значение = %d Минимальное значение = %d; \n5 повторялась %d раз\n", max, min, num5 );

        for (int j = 0; j < a.length; j++){             //сортируем
            boolean stop = true;

            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]) {                    //swap
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    stop = false;
                }

            }
            if (stop != false) {                         //оптимизация
                break;}
        }
        System.out.println("Отсортированый масив: ");
        for (int i = 0; i < a.length; i++)
            if (i != x-1 ) {
                System.out.print(a[i] + "; ");
            }
            else {
                System.out.println(a[i] + ".");
            }
        int maxcount = 0;

        for (int j = 0; j < a.length; j++) {
            int t = a[j];
            int count = 0;

            for (int i = 0; i < a.length - 1; i++) {
                if (t == a[i]) count++;

            }
            if (maxcount < count) maxcount = count;
        }
        System.out.println("одно и тоже значение повторялось максимум " +  maxcount + " раз.");
    }

}
