// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.


package seminar04_homework;

public class task02 {

    public static void main(String[] args){ 
        MyQueue myLL = new MyQueue();
        System.out.printf("Применяем несколько раз метод enqueue() и наполняем очередь: \n");
        myLL.enqueue(7);
        myLL.enqueue(6);
        myLL.enqueue(5);
        myLL.enqueue(4);
        System.out.printf("Очередь %s\n",(myLL.stringForPrint()));
        System.out.printf("Применяем метод dequeue(): ");
        System.out.println(myLL.dequeue());
        System.out.printf("Очередь %s\n",(myLL.stringForPrint()));
        System.out.printf("Применяем метод first(): ");
        System.out.println(myLL.first());
        System.out.printf("Очередь %s\n",(myLL.stringForPrint()));

    }
    
}
