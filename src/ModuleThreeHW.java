import java.util.Scanner;

public class ModuleThreeHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива ");

        int[] arrayInt = new int[scanner.nextInt()];                           //задаем размер масива


        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("введите " + (i + 1) + "-е значение массива -");
            arrayInt[i] = scanner.nextInt();
        }
        int max = arrayInt[0];
        int min = arrayInt[0];
        int num5 = 0;

        for (int i = 0; i<arrayInt.length; i++) {              // ищем макс, мин и количество 5-ок

            System.out.println(arrayInt[i] + "; ");              //не можем начать смотреть цикл с а[1] из-за этого

            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) min=arrayInt[i];
            if (arrayInt[i] == 5) num5++;
        }
        System.out.printf("Максимальное значение = %d. Минимальное значение = %d. \n5 повторялась %d раз\n", max, min, num5 );
        int count = 0;
        for (int j = 0; j < arrayInt.length; j++){             //сортируем
            boolean stop = true;

            count++;

            for (int i = 0; i < arrayInt.length-count; i++){
                if (arrayInt[i] > arrayInt[i+1]) {                    //swap
                    int temp = arrayInt[i];
                    arrayInt[i] = arrayInt[i+1];
                    arrayInt[i+1] = temp;
                    stop = false;
                }

            }
            if (stop != false) {                         //оптимизация
                break;}
        }
        System.out.println("Отсортированый масив: ");
        for (int i = 0; i < arrayInt.length; i++)
            if (i != arrayInt.length-1 ) {
                System.out.print(arrayInt[i] + "; ");
            }
            else {
                System.out.println(arrayInt[i] + ".");
            }
        int maxcount = 0;
        int mincount = Integer.MAX_VALUE;
        for (int j = 0; j < arrayInt.length; j++) {            //начало поиска количиства повторений
            int temp = arrayInt[j];

            count = 0;

            for (int i = 0; i < arrayInt.length; i++) {
                if (temp == arrayInt[i]) count++;

            }
            if (mincount > count) mincount = count;
            if (maxcount < count) maxcount = count;
        }
        System.out.println("одно и тоже значение повторялось максимум " +  maxcount + " раз.");
        System.out.println("одно и тоже значение повторялось минимум " +  mincount + " раз.");
    }

}
