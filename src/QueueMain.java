import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Pessoa> pessoas = new PriorityQueue<>();

        Pessoa pessoa1 = new Pessoa("859", "Filipos", 1);
        Pessoa pessoa2 = new Pessoa("12", "joséscreudo", 3);
        Pessoa pessoa3 = new Pessoa("60", "joséscreudo", 2);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Peek: " + pessoas.peek());

        Iterator iterableQueue = pessoas.iterator();

        while (iterableQueue.hasNext()){
            System.out.println(iterableQueue.next());
        }
//        pessoas.forEach(System.out::println);


    }

}
