import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Task 1
        System.out.println("Task 1");
        int[] mas1 = new int[20];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = i + 1;
        }
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                System.out.print(mas1[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = i + 1;
        }
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                System.out.println(mas1[i] + " ");
            }
        }
        System.out.println();
//        Task2
        System.out.println("Task2");
        int[] mas2 = new int[100];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = i + 1;
        }
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 != 0) {
                System.out.print(mas2[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = i + 1;
        }
        for (int i = mas2.length - 1; i >= 0; i--) {
            if (mas2[i] % 2 != 0) {
                System.out.print(mas2[i] + " ");
            }
        }
        System.out.println();
//        Task3
        System.out.println("Task3");
        int result = 0;
        int[] mas3 = new int[15];
        for (int i = 0; i < mas3.length; i++) {
            Random rnd = new Random();
            mas3[i] = rnd.nextInt(99);
            {
                System.out.print(mas3[i] + " ");
            }
            if (mas3[i] > 0 && mas3[i] % 2 == 0)
                result++;
            System.out.println();
        }
        System.out.println("Всего в массиве " + result + " четных");
//        Task4
        System.out.println("Task4");
        int[] mas4 = new int[20];
        for (int i = 0; i < mas4.length; i++) {
            Random rnd = new Random();
            mas4[i] = rnd.nextInt(20);
            {
                System.out.print(mas4[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < mas4.length; i++) {
            if (mas4[i] > 0 && mas4[i] % 2 != 0) {
                mas4[i] = 0;
            }
            System.out.print(mas4[i] + " ");
        }
        System.out.println();
//        Task5
        System.out.println("Task5");
        double sum1 = 0;
        double sum2 = 0;
        int[] mas51 = new int[5];
        for (int i = 0; i < mas51.length; i++) {
            Random rnd = new Random();
            mas51[i] = rnd.nextInt(16);
            {
                System.out.print(mas51[i] + " ");
            }
            sum1 += (double) mas51[i] / mas51.length;
        }
        System.out.println();
        int[] mas52 = new int[5];
        for (int i = 0; i < mas52.length; i++) {
            Random rnd = new Random();
            mas52[i] = rnd.nextInt(16);
            {
                System.out.print(mas52[i] + " ");
            }
            sum2 += (double) mas52[i] / mas52.length;
        }
        if (sum1 > sum2) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (sum2 > sum1) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Средние арифметические равны");
        }
//            Task6
        System.out.println("Task6");
        int[] mas6 = new int[4];
        for (int i = 0; i < mas6.length; i++) {
            Random rnd = new Random();
            mas6[i] = rnd.nextInt(11);
            {
                System.out.print(mas6[i] + " ");
            }
        }
        boolean validFirst = true;
        for (int i = 0; i < mas6.length; i++) {
            if (i != mas6.length - 1 && mas6[i] > mas6[i + 1]) {
                validFirst = false;
                break;
            }
        }

        if (validFirst) {
            System.out.println("Строго возрастающая последовательность");
        }

        boolean validSecond = true;
        for (int i = 0; i < mas6.length; i++) {
            if (i != mas6.length - 1 && mas6[i] < mas6[i + 1]) {
                validSecond = false;
                break;
            }
        }
        if (validSecond) {
            System.out.println("Строго убывающая последовательность");
        }
        System.out.println();
//        Task7
        System.out.println("Task7");
        int[] mas7 = new int[12];
        int max7 = 0;
        int index7 = 0;
        for (int i = 0; i < mas7.length; i++) {
            Random rnd = new Random();
            mas7[i] = rnd.nextInt(16);
            System.out.print(mas7[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas7.length; i++) {
                if (mas7[i] >= max7) {
                    max7 = mas7[i];
                index7 = i;
            }
        }
        System.out.println("Самое большое число " + max7 + " и индекс его последнего вхождения " + index7);
//        Task8
        System.out.println("Task8");
        int[] mas81 = new int[10];
        int[] mas82 = new int[10];
        double[] mas83 = new double[10];
        for (int i = 0; i < mas81.length; i++) {
            Random rnd = new Random();
            mas81[i] = rnd.nextInt(10);
            System.out.print(mas81[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas82.length; i++) {
            Random rnd = new Random();
            mas82[i] = rnd.nextInt(10);
            System.out.print(mas82[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas83.length; i++) {
            mas83[i] = (double) mas81[i] / mas82[i];
            {
                System.out.print(mas83[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < mas83.length; i++) {
            if (mas83[i] % 1 == 0) {
                System.out.print(mas83[i] + " ");
            }
        }
        System.out.println();
//            Task9
        System.out.println("Task9");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("Введено число " + value);
        if (value <= 0 || value % 2 != 0) {
            System.out.println("Вы ввели неверное число, введите положительное чётное число");
        } else {
            int[] mas9 = new int[value];
            int halfLength = 0;
            for (int i = 0; i < mas9.length; i++) {
                Random rnd = new Random();
                mas9[i] = rnd.nextInt(16);
                System.out.print(mas9[i] + " ");
            }
            System.out.println();
            halfLength = mas9.length / 2;
            int firstHalf = 0;
            int secondHalf = 0;
            for (int i = 0; i < halfLength; i++) {
                firstHalf += mas9[i];
            }
            for (int i = halfLength; i < mas9.length; i++) {
                secondHalf += mas9[i];
            }
            System.out.println(firstHalf);
            System.out.println(secondHalf);
            if (firstHalf > secondHalf) {
                System.out.println("Сумма левой половины больше");
            } else if (firstHalf < secondHalf) {
                System.out.println("Сумма правой половины больше");
            } else {
                System.out.println("Суммы модулей равны");
            }
        }
//        Task10
        System.out.println("Task10");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.println(n);
        if (n <= 3) {
            System.out.println("Вы ввели неверное число, введите число больше 3");
        } else {
            int[] mas10 = new int[10];
            for (int i = 0; i < mas10.length; i++) {
                Random rnd = new Random();
                mas10[i] = rnd.nextInt(n);
                System.out.print(mas10[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < mas10.length; i++) {
                if (mas10[i] % 2 == 0 && mas10[i] != 0) {
                    System.out.print(mas10[i] + " ");
                }
            }
        }
    }
}

