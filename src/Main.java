import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1
        /*
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3.Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
         с помощью ключевого слова или сразу заполненный элементами.
         */

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        double[] d = {1.57, 7.654, 9.986};
        boolean[] boo = {true, false};

        //task2
        /*
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
         через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i >= array.length - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j]);
            if (j >= d.length - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        for (int k = 0; k < boo.length; k++) {
            System.out.print(boo[k]);
            if (k >= boo.length - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        //task3
        /*
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
         а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются
          на одной строчке, а элементы другого массива – на другой. Запятая между последним элементом одного массива и
           первым элементом следующего не нужна.
         */
        System.out.print("\n");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i <= 0) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        for (int j = d.length - 1; j >= 0; j--) {
            System.out.print(d[j]);
            if (j <= 0) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        for (int k = boo.length - 1; k >= 0; k--) {
            System.out.print(boo[k]);
            if (k <= 0) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

        //task4
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
         */
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i]);
            if (i >= array.length - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println("/n");

        //task5*
        /*
        Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в
         консоль. Постарайтесь заполнить обе диагонали в одном цикле. Для печати следует использовать следующий код:
    for (int[] row : matrix) {
        for (int column : row) {
            System.out.print(column + " ");
        }
        System.out.println();
    }
         */
        int size = 3;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        // task6

        /*Задание 6
        У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
                Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью
        System.out.println(Arrays.toString(arr));
        Критерии оценки:
– В консоль выведен результат программы до преобразований массива.
– В консоль выведен результат программы после преобразований массива.
– Программа выводит корректный результат при смене значений внутри массива.
         */

        int[] arr = {5, 4, 3, 2, 1};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr.length - i - 1] = arr[i];
        }
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }
}