import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        

        
    }

    public void exemplo2(){
        Stack<Veiculo> veiculos = new Stack<>();
        //Criacao com objeto externamente e adicionando na pilha
        Veiculo v1 = new Veiculo("Azul", "Ford", "Fiesta");
        veiculos.push(v1);

        //Criando objeto internamente e adicionando na pilha
        veiculos.push(new Veiculo("Vermelho", "Fiat", "Fiesta"));

        //Recuperando


        Veiculo v2 = veiculos.pop();
        System.out.println(v2.getModelo());

        //Obtendo uma posição da pilha
        System.out.println(veiculos.pop());
    }

    public void exemplo1(){
        Stack<String> pratos = new Stack<>();
        
        //Adicionando elementos na pilha

        //LIFO (Last In, First Out)
        pratos.push("Laranja"); // Fim da pilha (1 prato a ser empilhado)
        pratos.push("Azul");
        pratos.push("Verde");
        pratos.push("Vermelho"); // Inicio da Pilha

        //removendo elemento
        String removido = pratos.pop();
        System.out.println(removido);

        //removendo elemento da pilha
        String topo = pratos.peek();
        System.out.println(topo);

        //verificando se a pilha esta vazia
        boolean situacao = pratos.isEmpty();
        System.out.println(situacao);

        //verificando o tamanho da pilha
        int tamanho = pratos.size();
        System.out.println(tamanho);
        
        System.out.println("Exemplo com For-Each: ");
        for(String prato: pratos){
            System.out.println(prato);
        }
        System.out.println("Exemplo com while: ");
        while(!pratos.isEmpty()){
            System.out.println(pratos.pop());
        }

    }
}
