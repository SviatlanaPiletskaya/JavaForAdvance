package HW1;

public class Task2 {
    public static void main(String[] args){
        int a = 20;
        int b = 3;
        int summ = a + b;
        int mult = a * b;
        int subtr = a - b;
        double div = a / b;
        int remainder = a % b;
        System.out.println("Сложение переменных а и b: \t\t\t\t" + a + " + " + b + " = " + summ  );
        System.out.println("Умножение переменных а и b: \t\t\t" + a + " * " + b + " = " + mult  );
        System.out.println("Вычитание переменных а и b: \t\t\t" + a + " - " + b + " = " + subtr  );
        System.out.println("Деление переменных а и b: \t\t\t\t" + a + " / " + b + " = " + div  );
        System.out.println("Остаток от деления переменных а и b: \t" + a + " % " + b + " = " + remainder  );
        if (a % 2 ==0){
            System.out.println("Переменная а - чётная");
        } else {
            System.out.println("Переменная а - нёчетная");
        }
        if (b % 2 ==0) {
            System.out.println("Переменная b - чётная");
        } else {
            System.out.println("Переменная b - нечётная");
        }
    }
}
