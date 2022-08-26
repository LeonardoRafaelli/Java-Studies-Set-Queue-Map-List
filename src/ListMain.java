import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("4", "robson", 15));
        pessoas.add(new Pessoa("1", "milly", 17));
        pessoas.add(new Pessoa("3", "robson", 15));
        pessoas.add(new Pessoa("2", "robson", 15));
        pessoas.add(new Pessoa("5", "robson", 15));

        pessoas.forEach(e -> {
            System.out.println(e.getCpf());
        });
    }
}
