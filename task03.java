// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

package seminar04_homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class task03 {
    
    // Пользователь вводит размер массива
    public static int inputNumber(Scanner iScanner) {             
        System.out.printf("Введите число элементов в списке: ");
        String number = iScanner.nextLine();
        return Integer.parseInt(number);
        }

    // Заполняем лист случайным образом
    public static LinkedList<Integer> fillList(int size, LinkedList<Integer> lList) {             
        for (int i = 0; i < size; i++){
            lList.addFirst((int)(Math.random()*100));
        }
        return lList;
        }

      // Сумма 
      public static int sum(LinkedList<Integer> lList) {             
        Iterator<Integer> iterator = lList.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
        }    


    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        int size = inputNumber(iScanner);
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList = fillList(size, myLinkedList);
        System.out.printf("Ваш массив: ");
        System.out.println(myLinkedList);
        System.out.printf("Сумма элементов: %d", sum(myLinkedList));

        iScanner.close();

    } 
}
