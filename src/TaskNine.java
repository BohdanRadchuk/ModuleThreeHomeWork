import java.util.ArrayList;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers of array. Enter any non-integer to stop");

        while(scanner.hasNextInt())
            arrayInt.add(scanner.nextInt());
        System.out.println(arrayInt);


        int max = arrayInt.get(0);
        int min = arrayInt.get(0);
        int num5 = 0;

        for (int i = 0; i<arrayInt.size(); i++) {              // ищем макс, мин и количество 5-ок



            if (arrayInt.get(i) > max) {
                max = arrayInt.get(i);
            }
            if (arrayInt.get(i) < min) min=arrayInt.get(i);
            if (arrayInt.get(i) == 5) num5++;
        }
        System.out.printf("Максимальное значение = %d. Минимальное значение = %d. \n5 повторялась %d раз\n", max, min, num5 );

        for (int j = 0; j < arrayInt.size(); j++){             //сортируем
            boolean stop = false;

            for (int i = 0; i < arrayInt.size()-1; i++){
                if (arrayInt.get(i) > arrayInt.get(i+1)) {                    //swap
                    int temp = arrayInt.get(i);
                    arrayInt.set(i,arrayInt.get(i+1) );
                    arrayInt.set(i+1, temp);
                    stop = true;
                }

            }
            if (stop == false) {                         //оптимизация
                break;}
        }
        System.out.println("Отсортированый масив: ");
        for (int i = 0; i < arrayInt.size(); i++)
            if (i != arrayInt.size()-1 ) {
                System.out.print(arrayInt.get(i) + "; ");
            }
            else {
                System.out.println(arrayInt.get(i) + ".");
            }
        int maxcount = 0;
        int mincount = Integer.MAX_VALUE;
        for (int j = 0; j < arrayInt.size(); j++) {            //начало поиска количиства повторений
            int temp = arrayInt.get(j);

            int count = 0;

            for (int i = 0; i < arrayInt.size(); i++) {
                if (temp == arrayInt.get(i)) count++;

            }
            if (mincount > count) mincount = count;
            if (maxcount < count) maxcount = count;
        }
        System.out.println("одно и тоже значение повторялось максимум " +  maxcount + " раз.");
        System.out.println("одно и тоже значение повторялось минимум " +  mincount + " раз.");



    }
}

