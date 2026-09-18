import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando um vetor vazio
        int[] vetor = new int[5];

        // adicionando valores no vetor através do acesso rápido
        // vetor[i] 
        // i = index
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        //recuperando valores através do acesso rapido
        System.out.println(vetor[2]);
        int n =  vetor[3];

        //modificando valores através do acesso rapido
        vetor[3] = 70;
        System.out.println(vetor[3]);


        //exibindo
        // System.out.println(vetor); - não é possível exibir o vetor
        
        //converter para texto
        System.out.println(Arrays.toString(vetor));

        //acesso posicional: percorrer o vetor pelo o seu indice
        for(int i =0; i < vetor.length; i++){
            System.out.println("Indice: "+i +" Valor:"+vetor[i]);
        }

        //obter o tamanho do vetor: length
        System.out.println("Tamanho do vetor: "+vetor.length);


        //criando um vetor com valores inicializador
        String[] alunos = {"Daniel", "Maria", "Pedro", "Paulo", "Matheus"};

        System.out.println(alunos.length);
        System.out.println(Arrays.toString(alunos));

        //for-each: simplificação do for
        // aqui o index implicito (oculto), para obte-lo é necessário criar uma variavel
        // int i = 0;
        for (String aluno : alunos){
            System.out.println(aluno);
            // System.out.println(i);
            // i++;
        }

        //for
        for (int i=0; i<alunos.length;i++){
            System.out.println("Indice: " + i + " Valor: "+ alunos[i]);
        }

        //situação de erro:
        
        //não existe esse indice, houve um erro
        // o tamanho máximo do vetor é n-1
        // alunos[5] = "José";

        //criando um vetor vazio e quer adicionar valores posteriormente
        // String[] carro = {};
        // carro[0] = "Mobi";
        // carro[1] = "Kwid";
        // carro[3] = "Up";
        
        // forma correta:
        String[] carro_ = new String[3];
        carro_[0] = "Mobi";
        carro_[1] = "Kwid";
        carro_[2] = "Up";

        //funções para vetore
        // clone: uma cópia do vetor
        String[] copy = carro_.clone();
        System.out.println(Arrays.toString(copy));

        //copyOf: é uma cópia de uma determinada parte do vetor
        String[] copy2 = Arrays.copyOf(carro_, 2);
        System.out.println(Arrays.toString(copy2));

        //sort: organizar um vetor em ordem crescente

        // alterando o tamanho do vetor de 5 para 3 é possível ordenar
        Arrays.sort(carro_);
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(carro_));
        System.out.println(Arrays.toString(vetor));

        //equals: verificar se o vetor é igual
        boolean situacao = Arrays.equals(copy, carro_);
        System.out.println(situacao);
        situacao = Arrays.equals(carro_, copy2);
        System.out.println(situacao);

        //binarySearch: localizar um elemento
        // é necessário esta ordenado
        int index = Arrays.binarySearch(vetor, 10);
        System.out.println(index);
        
        //é um exemplo de erro, pois o vetor _carro não esta ordenado E possui endereços vazios
        index = Arrays.binarySearch(carro_, "Kwid");
        System.out.println(index);


        Aluno[] estudantes = new Aluno[5];

        //1ª -> Criado um objeto por fora e adicionado no Vetor
        Aluno a1 = new Aluno (123, "Paulo", "ADS");
        estudantes[0] =a1;

        //2ª -> O objeto foi criado dentro do Vetor
        estudantes[1] = new Aluno(456,"Pedro", "Eng. Software");
        
        // exibindo os valores do objeto
        System.out.println(a1);

        System.out.println(estudantes[0]);
        System.out.println(estudantes[1]);

        a1.setNome("Maria");
        System.out.println(estudantes[0]); //Paulo
        System.out.println(a1); //Maria 

        estudantes[1].setNome("Matheus");
        System.out.println(estudantes[1]);


    }
}
