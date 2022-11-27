// Задача 1

// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)

package Task_0.Task_1;

// Импортируем сканер
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        // иницилизируем сканер
        Scanner scanner = new Scanner(System.in);
        // Просим пользователя ввести n 
        System.out.println("Введите n: ");
        // Считываем строку из консоли
        int n= scanner.nextInt();
        // Выводим на печать результаты функций
        System.out.printf("Сумма от 1 до (n равна %s\n", sumCount(n));
        System.out.printf("Произведение от 1 до n равно %s", factorial(n));
        // Завершаем работу сканера
        scanner.close();
    }

    // Создаем функцию подсчета суммы от 1 до n
    public static int sumCount(int n) {
        // создаем переменную
        int sum = 0;
        // Через цикл перебираем все числа от 1 до n
        for (int i = 1; i <= n; i++) {
            // Суммируем
            sum += i;

        }
        // Возвращаем результат
        return sum;
    } 

    // Создаем функцию факториала от 1 до n   
    public static int factorial(int n) {
        // создаем переменную
        int f = 1;
         // Через цикл перебираем все числа от 1 до n
        for (int i = 1; i <= n; i++) {
            // Умножаем следующий индекс на полученое произведение
            f *= i;
            
        }
        // Возвращаем результат
        return f;
    }    
}

