// Задача 3.
// Реализовать простой калькулятор + - / * 

package Task_0.Task_3;

// Импортируем сканер
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        // иницилизируем сканер
        Scanner scanner = new Scanner(System.in);
        // Просим пользователя ввести число 
        System.out.println("Введите первое число: ");
        // Считываем строку из консоли
        int a = scanner.nextInt();
        // Просим пользователя ввести оператор действия
        System.out.println("Введите оператор действия(+ - * /): ");
        // Возвращаем символ строки по указанному индексу
        char op = scanner.next().charAt(0);
        // Просим пользователя ввести число 
        System.out.println("Введите второе число: ");
        // Считываем строку из консоли
        int b = scanner.nextInt();

        // После выбора пользователем оператора действия создается соотвествующая
        // конструкция калькулятора и выводится на экран
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + sum(a, b)); 
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + mult(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + divide(a, b));
                break;
            default:
                System.out.println("Неправильный оператор действия!");      
        }
        // Завершаем работу сканера
        scanner.close();        
    }

    // Функция математических действий(после выполнения результат добавляется в switch)
    private static int divide(int a, int b) {
        if (b != 0) return a/b;          
            else 
        return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}


