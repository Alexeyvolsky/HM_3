import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task1
        System.out.println("Task1");
        int[] mas1 = new int[10];
        int product1 = 1;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = i + 1;
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas1.length; i++){
            if (mas1[i] % 3 == 0) {
                product1 *= mas1[i];
            }
    }
        System.out.print(product1);
        System.out.println();
//        Task2
        System.out.println("Task2");
        int[] mas2 = new int[20];
        int count2 = 0;
        double sum2 = 0;
        double average2 = 0;
        for (int i = 0; i < mas2.length; i++){
            mas2[i] = i + 1;
        }
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 != 0) {
                sum2 += mas2[i];
                count2 ++ ;
                average2 = (double) sum2 / count2;
                System.out.print(mas2[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Среднеее арифметическое " + average2);
//        Task3
        System.out.println("Task3");
        int[] mas3 = new int[33];
        double sum3 = 0;
        double average3 = 0;
        int count3 = 0;
        for (int i = 0; i < mas3.length; i++){
            mas3[i] = i + 1;
        }
        for (int i = 0; i < mas3.length; i++){
            if (mas3[i] > 18){
                sum3 += mas3[i];
                count3 ++;
                average3 = (double) sum3 / count3;
                System.out.print(mas3[i] + " ");
            }
        }
        System.out.println();
        System.out.println(average3);
//        Task4
        System.out.println("Task4");
        int[] mas4 = new int[24];
        int min4 = 0;
        for (int i = 0; i < mas4.length; i++){
            mas4[i] = i + 1;
        }
        for (int i = 0; i < mas4.length; i++) {
            if (mas4[i] % 2 != 0) {
                min4 = mas4[i];
                System.out.print(min4 +" ");
                break;
            }
        }
        System.out.println();
//        Task5
        System.out.println("Task5");
        int[] mas5 = new int[20];
        int  zero= 0;
        for (int i = 0; i < mas5.length; i++) {
            mas5[i] = i + 1;
            System.out.print(mas5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas5.length; i++) {
            if (mas5[i] > 0 && mas5[i] % 2 == 0) {
                mas5[i] = 0;
            }
            System.out.print(mas5[i] + " ");
        }
        System.out.println();
//        Task6
        System.out.println("Task6");
        int[] mas6 = new int[15];
        for (int i = 0; i < mas6.length; i++) {
            Random rnd = new Random();
            mas6[i] = rnd.nextInt(20);
                System.out.print(mas6[i] + " ");
        }
        System.out.println();
        boolean flag = false;
        for (int i = 0; i < mas6.length; i++) {
            for (int j = i + 1; j < mas6.length; j++) {
                if (mas6[i] == mas6[j]) {
                    flag = true;
                    System.out.println("Есть одинаковые элементы");
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

//    Task7
        System.out.println("Task7");
        int[] mas7 = new int[15];
        for (int i = 0; i < mas7.length; i++) {
            Random rnd = new Random();
            mas7[i] = rnd.nextInt(20);
            System.out.print(mas7[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result6 = 0;
        for (int i = 0; i < mas7.length; i++){
            if(mas7[i] == a){
                result6 ++;
            }
        }
        System.out.println(result6);
//        Task8
        System.out.println("Task8");
        int[] mas8 = new int[10];
        int max8 = 0;
        int secondmax8 = 0;
        for (int i = 0; i < mas8.length; i++) {
            mas8[i] = i + 1;
            System.out.print(mas8[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas8.length; i++) {
            if (mas8[i] > max8) {
                secondmax8 = max8;
                max8 = mas8[i];
            }else if(mas8[i] > secondmax8){
                secondmax8 = mas8[i];
            }
        }
        System.out.println(secondmax8);
//        Task9
        System.out.println("Task9");
        int[] mas9 = new int[30];
        int min9 = 0;
        for (int i = 0; i < mas9.length; i++) {
            mas9[i] = i + 1;
            System.out.print(mas9[i] + " ");
        }
        System.out.println();
        min9 = mas9[2];
        for (int i = 0; i < mas9.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (mas9[i] < min9) {
                    min9 = mas9[i];
                }
            }
        }
        System.out.println(min9);
//        Task10
        System.out.println("Task10");
        int[] mas10 = new int[20];
        int max10 = 0;
        for (int i = 0; i < mas10.length; i++) {
            Random rnd = new Random();
            mas10[i] = rnd.nextInt(16);
            System.out.print(mas10[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas10.length; i++) {
            if (mas10[i] >= max10) {
                max10 = mas10[i];
            }
        }
        mas10[0] = max10;
        for (int i = 0; i < mas10.length; i++) {
            System.out.print(mas10[i] + " ");
        }
    }
}