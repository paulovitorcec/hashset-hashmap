import java.util.HashSet;

public class javaHashSet {
    public static void main(String[] args) throws Exception {
        
        int numeros[] = {1, 10, 50, 60, 10,
                        200, 300, 500, 700, 800,
                        900, 14, 33, 60, 55,
                        70, 80, 3, 100, 200,
                        25, 50, 75, 100, 300,
                        1000, 11, 22, 33, 60,
                        70, 80, 100, 35, 10,
                        150, 75, 85, 95, 200
                        };

        HashSet<Integer> numerosSorteio = new HashSet<Integer>();

        for (int numero : numeros) {
            numerosSorteio.add(numero);
        }

            int contandoNumerosUnicos = numerosSorteio.size();

            System.out.println("Após a exclusão dos números repetidos, temos " +contandoNumerosUnicos+ " números para realizarmos o sorteio!!!");
    }
}
