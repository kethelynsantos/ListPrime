import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "s";
        ArrayList<Integer> saoPrimos = new ArrayList<>();
        ArrayList<Integer> naoPrimos = new ArrayList<>();

        while (resposta.equalsIgnoreCase("s")) {
            System.out.print("\nDigite o número que deseja verificar: ");
            int numero = sc.nextInt();

            boolean v = verificando(numero);

            if (numero < 0 || numero > 10000) {
                System.out.println("Número inválido");
                continue;
            } else {
                if (v) {
                    System.out.println("O número " + numero + " é primo.");
                } else {
                    System.out.println("O número " + numero + " não é primo.");
                }
            }
            saoPrimos.clear();
            naoPrimos.clear();
            for (int i = 0; i <= numero; i++){
                if (verificando(i)){
                    saoPrimos.add(i);
                }else{
                    naoPrimos.add(i);
                }
            }

            int escolha;

            System.out.println("\nSelecione a lista a ser exibida\n\n[1] Números primos\n[2] Números não primos\n[3] Não quero ver nenhuma lista\n");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> System.out.println(saoPrimos);

                case 2 -> System.out.println(naoPrimos);
            }

            System.out.println("\nDeseja continuar? S/N");
            resposta = sc.next();
        }
    }

    private static boolean verificando(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}