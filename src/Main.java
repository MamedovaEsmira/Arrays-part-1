import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        System.out.println("пункт1");
        //Объявите три массива:
        //1. Целочисленный массив,
        // заполненный тремя цифрами
        // – 1, 2 и 3 –
        // с помощью ключевого слова new.
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        System.out.println("пункт2");
//Массив, в котором можно хранить
// три дробных числа –
// 1.57, 7.654, 9.986 –
// сразу заполнив его значениями.
        double[] weight = {1.57, 7.654, 9.986};
        System.out.println("пункт3");
//Произвольный массив
// – тип и количество данных определите сами.
// Самостоятельно выберите способ создания массива:
// с помощью ключевого слова
// или сразу заполненный элементами.
        int[] arr = {16, 28, 18, 35, 25, 0, 0};

        System.out.println("Задача2");
        //Пройдите по каждому из трех массивов
        // и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива
        // и первым элементом следующего не нужна.
        int[] box1 = {1, 2, 3};
        double[] weight1 = {1.57, 7.654, 9.986};
        int[] arr2 = {16, 28, 18, 35, 25, 0, 0};

        for (int i = 0; i < box1.length; i++) {
            System.out.print(box1[i]);
            if (i != box1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < weight1.length; i++) {
            System.out.print(weight1[i]);
            if (i != weight1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача3");
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольные элементы третьего массива*
        //То в третьем задании результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*
        int[] box2 = {1, 2, 3};
        double[] weight2 = {1.57, 7.654, 9.986};
        int[] arr3 = {16, 28, 18, 35, 25, 0, 0};
        for (int i = box2.length - 1; i >= 0; i--) {
            System.out.print(box2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = weight1.length - 1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задача4");
        //Пройдитесь по первому целочисленному массиву
        // и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом,
        // поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        int[] box3 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (box3[i] %2==1) {
                System.out.println(box3[i]+1);
            }
        }
    }
}