import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, Pessoa> pessoas = new HashMap<>();

        pessoas.put(8, new Pessoa("1", "Leozin", 18));
        pessoas.put(4, new Pessoa("2", "Leozika", 18));
        pessoas.put(3, new Pessoa("3", "Leozika", 18));
        pessoas.put(5, new Pessoa("4", "Leozika", 18));

        for(Integer key : pessoas.keySet()){
            if(pessoas.get(key).getCpf().equals("1")){
                System.out.println(pessoas.get(key).toString());
            }
        }

        //Atualizando um item do map
//        pessoas.put(2, new Pessoa("2354", "Jeremias", 87));

        pessoas.forEach((Integer key, Pessoa pessoa) -> {
            System.out.println(key);
        });
    }
}
