import java.util.Arrays;
import java.util.*;
//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
//Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        int[] randomMassive = new int[15];
        int n = 0;
        int sum = 0;
        for (int i = 0; i < randomMassive.length; i++) {
            randomMassive[i] = (int) (1 + Math.random() * 14);
            if (randomMassive[i] % 2 == 0) {
                n++;
                sum += randomMassive[i];
            }
        }

        System.out.println("Количество чётных чисел: " + n);

        System.out.println("Сортировка массива по возрастанию: ");

        Arrays.sort(randomMassive);
        System.out.println(Arrays.toString(randomMassive));
    }
}
