import kotlin.reflect.KFunction;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> pessoas = new PriorityQueue<>();

        pessoas.add(14);
        pessoas.add(3);
        pessoas.add(7);
        pessoas.add(4);
        pessoas.add(2);


        System.out.println("Peek" + pessoas.peek());

        pessoas.forEach(System.out::println);

    }
}
