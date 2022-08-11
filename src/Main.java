public class Main {
    public static void main(String[] args) {
        // task1
        /*
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3.Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
         с помощью ключевого слова или сразу заполненный элементами.
         */

        int[] array = new int[] {1, 2, 3};
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
            if (i % 2 == 0 ) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i]);
            if (i >= array.length - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();

    }
}