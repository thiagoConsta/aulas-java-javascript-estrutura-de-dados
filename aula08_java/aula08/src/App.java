import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        
        
    }

    public static void listaEncadeada(){
        LinkedList<String> nomes = new LinkedList<>();

        nomes.add("João");
        nomes.remove("João");

        //adicionar no inicio e fim da lista
        nomes.addFirst("João");
        nomes.addLast("Francisco");
        System.out.println(nomes.toString());

        //recuperar no inicio e fim da lista
        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());

        //remover no inicio e fim da lista
        nomes.removeFirst();
        System.out.println(nomes.toString());


        //
        nomes.removeLast();
        System.out.println(nomes.toString());


    }

    public static void lista(){
        //List é uma interface
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new LinkedList<>();
        
        lista1.add("Java");
        lista1.add("Python");

        lista2.add("JavaScript");
        lista2.add("C++");
    }

    public static void ListaSemDuplicata(){
        //lista hashset: não permite valores duplicados e coloca os itens ordenado
        HashSet <String> nomes = new HashSet<>();
        nomes.add("Pedro");
        nomes.add("Rebeca");
        nomes.add("Maria");
        System.out.println(nomes);

        nomes.add("Pedro");
        System.out.println(nomes);

        LinkedHashSet <String> linguagens = new LinkedHashSet<>();
        linguagens.add("Java");
        linguagens.add("JavaScript");
        linguagens.add("C++");
        linguagens.add("PHP");
        
        System.out.println(linguagens);
    }

    public static void ListaChaveValor(){
        HashMap<Integer, String> pokemons = new HashMap<>();
        
        pokemons.put(1, "Bullnasaur");
        pokemons.put(3, "Charmander");
        pokemons.put(6, "Squitle");

        System.out.println(pokemons);
    }

    public static void listaSimples(){
        System.out.println("Hello, World!");
        //criando uma lista simples
        ArrayList<String> frutas = new ArrayList<>();

        //adicionando itens na lista
        frutas.add("Maça");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Melão");
        frutas.add("Manga");
        
        //acessando elemento da lista
        System.out.println(frutas.get(1));

        //exibindo a lista
        System.out.println(frutas.toString());

        //obtenedo o tamanho d alista
        System.out.println(frutas.size());

        //verificando se a lista esta vazia
        System.out.println(frutas.isEmpty());

        //alterar um elemento da lista
        frutas.set(0,"Laranja");
        System.out.println(frutas.toString());

        //remover um elemento da lista
        frutas.remove(1);

        //localizar um elemento da lista
        System.out.println(frutas.contains("Manga"));

    }
}
