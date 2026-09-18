public class App {
    public static void main(String[] args) throws Exception {
        int [][] matriz = new int[2][3];

        // 2 -> quantidade de linhas [0] [1]
        // 3 -> quantidade de colunas [0] [1] [2]

        //coluna / linha
        // ACESSO DIRETO (OU RAPIDO)GUARDANDO VALORES EM UM DETERMINADO ENDEREÇO DA MATRIZ (LINHA E COLUNA)
        // 
        matriz[0][1] = 5;
        matriz[0][1] = 2;
        matriz[0][2] = 6;

        //linha / coluna
        matriz[1][0] = 2;
        matriz[1][1] = 3;
        matriz[1][2] = 9;

        // RECUPERAR VALORES

        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][2]);

     }
}
