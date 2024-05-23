import java.util.HashMap;
import java.util.Scanner;

public class javaHashMap {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dados = new HashMap<String, String>();

        for(int i = 0; i <5; i++) {
            System.out.println("Digite o CPF desejado:");
            String CPF = scanner.next();
            System.out.println("Digite o telefone desejado:");
            String Telefone = scanner.next();
        
            dados.put(CPF, Telefone);

        }

        System.out.println("\nDados recebidos............");
        dados.forEach((CPF, Telefone) -> {
            System.out.println("CPF: " + CPF + ", Telefone: " + Telefone);
        });


        }

    }