import java.util.LinkedList;
import java.util.Queue;
 
public class App {
 
    public static void main(String[] args) throws Exception {
 
        // Queue fila
        // LinkedList: duplamente fechada
        Queue<String> veiculos = new LinkedList();
 
        // Adicionando elementos na fila
        veiculos.offer("March");
        veiculos.offer("Up");
        veiculos.offer("Mobi");
 
        // Recupperando elemntos da fila:
        // Quem está no início da fila
        System.out.println(veiculos.peek());
 
        // Removendo o primeiro da fila
        System.out.println(veiculos.poll());
 
        // Exibindo elementos da fila
        System.out.println(veiculos);
 
    }
}