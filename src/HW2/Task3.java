package HW2;

public class Task3 {
    public static void main(String[] args) {
//        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш
//        выбор и вывести следующие строки:
//        a == b - если переменные равны
//        a < b - если переменная a меньше b
//        a > b - если переменная b меньше a

        int a, b;
        a = 250;
        b = 151;
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }

//        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш
//        выбор и вывести следующие строки:
//        maybe a and b are even - если сумма переменных четная
//        some variable is odd - если сумма переменных нечетная

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

//        Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести
//        следующие строки:
//        больше 10 - если переменная больше 10
//        меньше 100 - если переменная меньше 100
//        результат деления на 2 больше 20 - если это соответствует истине
//        значение переменной между 5 и 40 включительно - если это правда
//        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        int x = 40;
        if (x > 10) {
            System.out.println("больше 10");
        } else if (x < 100) {
            System.out.println("меньше 100");
        } else if ((x / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        } else if (x >= 5 && x <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

//        Необходимо вывести числа от 0 до 15.

        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

//    Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

        int num = 5;
        int s = 0;

        do {
            System.out.println("Число " + num + " в степени " + s + " равно " + (int)Math.pow(num, s));
            s++;
        } while (Math.pow(num, s) < 10000);


        /*for (int i = 1; val < 10000; i++) {
                val = (int)Math.pow(5, i);
                if (val < 10000){
                    System.out.println("Cтепень " + i + " числа 5 равна " + val);
                }
        }*/

//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i < 61; i += 4) {
            System.out.println(i);
        }

        for (int i = 40; i < 61; i++) {
            if ((i % 4) == 0)
                System.out.println(i);
        }
    }
}
