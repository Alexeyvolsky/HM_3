import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task1
        System.out.println("Task1");
        Scanner sc1 = new Scanner(System.in);
        int size1 = sc1.nextInt();
        System.out.println("Матрица размерами " + size1 + "*" + size1);
        int[][] mas1 = new int[size1][size1];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                Random rnd = new Random();
                mas1[i][j] = rnd.nextInt(51);
            }
        }
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                System.out.print(mas1[i][j] + " ");
            }
            System.out.println();
        }
        int diagonal1 = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                if (i == j && mas1[i][j] % 2 == 0) {
                    diagonal1 = diagonal1 + mas1[i][j];
                }
            }
        }
        System.out.println(diagonal1);
//        Task2
        System.out.println("Task2");
        Scanner sc2 = new Scanner(System.in);
        int size2 = sc2.nextInt();
        System.out.println("Матрица размерами " + size2 + "*" + size2);
        int[][] mas2 = new int[size2][size2];
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                Random rnd = new Random();
                mas2[i][j] = rnd.nextInt(51);
            }
        }
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int elements2 = 0;
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                if (i >= j && mas2[i][j] % 2 != 0) {
                    System.out.print(mas2[i][j] + " ");
                }
            }

        }
        System.out.println();
//        Task3
        System.out.println("Task3");
        Scanner sc3 = new Scanner(System.in);
        int size3 = sc3.nextInt();
        System.out.println("Матрица размерами " + size3 + "*" + size3);
        int[][] mas3 = new int[size3][size3];
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                Random rnd = new Random();
                mas3[i][j] = rnd.nextInt(51);
            }
        }
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                System.out.print(mas3[i][j] + " ");
            }
            System.out.println();
        }
        int glavnaya3 = 1;
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                if (i == j) {
                    glavnaya3 = glavnaya3 * mas3[i][j];
                }

            }

        }
        System.out.println("Произведение элементов главной диагонали " + glavnaya3);
        int pobochnaya3 = 1;
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                if (j == mas3.length - i - 1) {
                    pobochnaya3 = pobochnaya3 * mas3[i][j];
                }

            }
        }
        System.out.println("Произведение элементов побочной диагонали " + pobochnaya3);
        if (glavnaya3 > pobochnaya3) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (glavnaya3 < pobochnaya3) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведение диагоналей равно");
        }
//        Task4
        System.out.println("Task4");
        Scanner sc4 = new Scanner(System.in);
        int size4 = sc4.nextInt();
        System.out.println("Матрица размерами " + size4 + "*" + size4);
        int[][] mas4 = new int[size4][size4];
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                Random rnd = new Random();
                mas4[i][j] = rnd.nextInt(51);
            }
        }
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                System.out.print(mas4[i][j] + " ");
            }
            System.out.println();
        }
        int diagonal4 = 0;
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                if (j < mas4.length - i - 1 && mas4[i][j] % 2 == 0) {
                    diagonal4 = diagonal4 + mas4[i][j];
                }

            }
        }
        System.out.println("Сумма чётных элементов над побочной диагональю : " + diagonal4);
//        Task5
        System.out.println("Task5");
        Scanner sc5 = new Scanner(System.in);
        int size5 = sc5.nextInt();
        System.out.println("Матрица размерами " + size5 + "*" + size5);
        int[][] mas5 = new int[size5][size5];
        for (int i = 0; i < mas5.length; i++) {
            for (int j = 0; j < mas5[i].length; j++) {
                Random rnd = new Random();
                mas5[i][j] = rnd.nextInt(51);
            }
        }
        for (int i = 0; i < mas5.length; i++) {
            for (int j = 0; j < mas5[i].length; j++) {
                System.out.print(mas5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
            for (int i = 0; i < mas5.length; i++) {
                for (int j = 0; j < mas5[i].length; j++) {
                    System.out.print(mas5[j][i] + " ");
                }
                System.out.println();
            }
        }
    }