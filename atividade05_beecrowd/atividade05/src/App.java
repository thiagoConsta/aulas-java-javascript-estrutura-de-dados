
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String expressao = sc.nextLine();

            Stack<Character> pilha = new Stack<>();
            boolean correto = true;

            for (int i = 0; i < expressao.length(); i++) {
                char c = expressao.charAt(i);

                if (c == '(') {
                    pilha.push(c);
                } else if (c == ')') {
                    if (pilha.isEmpty()) {
                        correto = false;
                        break;
                    }

                    pilha.pop();
                }
            }

            if (correto && pilha.isEmpty()) {
                System.out.println("correto");
            } else {
                System.out.println("incorreto");
            }
        }

        sc.close();
    }
}
