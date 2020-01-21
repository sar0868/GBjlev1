//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
// условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив размером 8. С помощью цикла
// заполнить его значениями 0 3 6 9 12 15 18 21;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
// по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество
// строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить
// его диагональные элементы единицами;
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный
// элементы (без помощи интернета);
//6. ** Написать метод, в который передается не пустой одномерный
// целочисленный массив, метод должен вернуть true, если в массиве есть
// место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
// символами ||, эти символы в массив не входят.
//7. **** Написать метод, которому на вход подается одномерный массив
// и число n (может быть положительным, или отрицательным), при этом
// метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.


import java.util.Random;
import java.util.Scanner;

public class lesson2 {
    static void task1(){
        int[] arrInt1 = new int[]{ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrInt1.length; i++){
            if (arrInt1[i] == 0){
                arrInt1[i] = 1;
            } else {
                arrInt1[i] = 0;
            }
        }
        for (int i = 0; i < arrInt1.length; i++){
            System.out.print(arrInt1[i] + " ");
        }
    }

    static void task2(){
        Scanner inp = new Scanner(System.in);
        int[] arr2 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr2[i] = inp.nextInt();
        }
        int i = 0;
        while (i < arr2.length){
            System.out.printf("%3d", arr2[i]);
            i++;
        }
    }
    static void task3(){
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length ; i++) {
            System.out.printf("%3d", arr3[i]);
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6){
                arr3[i] *= 2;
            }
        }
        for (int i = 0; i < arr3.length ; i++) {
            System.out.printf("%3d", arr3[i]);
        }
    }

    static void task4(){
        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr4[i][j]);
            }
            System.out.println();
        }
        System.out.println("##############" );

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j == n -1){
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr4[i][j]);
            }
            System.out.println();
        }
    }

    static void task5(){
        int[] min = new int[]{0,0};
        int[] max = new int[]{0,0};


        int[] arr5 = new int[12];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] <= min[0]){
                min[0] = arr5[i];
                min[1] = i;
            }
            if (arr5[i] >= max[0]){
                max[0] = arr5[i];
                max[1] = i;
            }
        }
        for (int i = 0; i < arr5.length ; i++) {
            System.out.printf("%3d", arr5[i]);
        }
        System.out.println("\n min: " + min[0] + ", position: " + min[1]);
        System.out.println("max: " + max[0] + ", position: " + max[1]);

    }


    public static void main(String[] args) {
        task5();
    }
}