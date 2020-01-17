public class HW1 {
/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
 в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен
 напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
 ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод
 должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка,
 обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит
 сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
 при этом каждый 400-й – високосный.
 */

    static double example3(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    static boolean example4(int a, int b){
        boolean result = true;
        if (a + b > 20 || a + b < 10){
            result = false;
        }
        return  result;
    }

    static  void example5 (int a){
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static  boolean example6 (int a){
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    static  void example7 (String str){
        System.out.println("Привет, " + str + "!");
    }

    static void example8 (int year){
        if(year % 400 == 0){
            System.out.println(year + " - високосный год.");
        } else if (year % 100 == 0){
            System.out.println(year + " - не високосный год.");
        } else if(year % 4 == 0){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void main(String[] args) {
        byte byteValue = 2;
        short shortValue = 300;
        int intValue = 2343;
        long longValue = 638766286;

        float floatValue = 2.3f;
        double doubleValue  = 3.5;

        boolean result = true;

        char ch = 'F';

        System.out.println("3. " + example3(2, 3 ,4 ,5));
        System.out.println("4. " + example4(7, 9));
        System.out.println("4. " + example4( 1, 4));
        System.out.print("5. ");
        example5(9);
        System.out.print("5. ");
        example5(-76);
        System.out.println("6. " + example6(87));
        System.out.println("6. " + example6(-87));
        example7("Алексей");
        example8(104);
    }
}
