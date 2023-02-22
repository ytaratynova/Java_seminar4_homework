package seminar04_homework;

import java.util.LinkedList;

public class MyQueue {

    private LinkedList<Integer> linkedList = new LinkedList<>();
    // enqueue() - помещает элемент в конец очереди
    void enqueue(int elem){
        linkedList.addLast(elem);
    }
    
    //dequeue() - возвращает первый элемент из очереди и удаляет его
    Integer dequeue() {
        if (!linkedList.isEmpty()){
            return linkedList.pollFirst();
        } else {
            return null;
        }
    }
    
    //first() - возвращает первый элемент из очереди, не удаляя
    Integer first() {
        if(!linkedList.isEmpty()) {
            return linkedList.peekFirst();
        } else{
        return null;
        }
    }

    //для печати
    String stringForPrint() {
        return linkedList.toString();
    }
}
