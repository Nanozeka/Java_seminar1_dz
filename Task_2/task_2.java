// Задача 2.

// Вывести все простые числа от 1 до 1000 

package Task_0.Task_2;

public class task_2 {
    public static void main(String[] args) {

        // Создаем цикл для перебора чисел от 1 до 1000
        for (int index = 1; index < 1000; index++) {
            //  Если индекс найденый функцией findSimpleNumber соответсвует истине,
            //  то выводим его на печать
            if (findSimpleNumber(index) == true) {
                System.out.println(index);
            }
        }
    }

    //функция определяет тип числа(True или false)
    public static Boolean findSimpleNumber(int num) {    
        // Если число делится само на себя или на 1 то возвращаем true
        for (int index = 2; index <= Math.sqrt(num); index++) {
            if ((num == 1) || (num % index == 0)) {
                return false;
            }
        }
        return true;
    }

}


