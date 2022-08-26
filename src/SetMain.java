import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        TreeSet<Pessoa> pessoas = new TreeSet<>();

        Pessoa pessoa1 = new Pessoa("859", "Filipos", 1);
        Pessoa pessoa2 = new Pessoa("12", "joséscreudo", 3);
        Pessoa pessoa3 = new Pessoa("60", "joséscreudo", 2);

        pessoas.add(pessoa2);
        pessoas.add(pessoa1);
        pessoas.add(pessoa3);

//        pessoas.add(new Pessoa("234", "BibiBurg", 23));
//        pessoas.add(new Pessoa("14", "Jaci", 5));
//        pessoas.add(new Pessoa("14", "Nome", 5));


//        System.out.println(pessoas.ceiling(pessoa3));
//        pessoas.forEach(System.out::println);


    }
}
