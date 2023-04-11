import java.util.Scanner;

public class Senhas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = sc.next();

        int contador = 1;
// Método equals compara Strings.
        while (!senha.equals("senha123") && contador <= 2) {
            System.out.println("Senha Incorreta, Tente Novamente : \nTentativas Restantes : " + (3 - contador));
            contador++;
            senha = sc.next();
        }
        System.out.println();

        if (senha.equals("senha123")) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Bloqueado ( Senha Incorreta)");
        }
        sc.close();

    }
}
