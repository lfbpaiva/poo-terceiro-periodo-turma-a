package segundobi.aulas.auladois;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.isEmpty());
    }
}