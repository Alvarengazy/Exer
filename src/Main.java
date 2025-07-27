import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("""

                    --- MENU FIGURAS ----
                    | 1 - Retângulo     |
                    | 2 - Quadrado      |
                    | 3 - Circulo       |
                    | 0 - Sair          |
                    ---------------------
                    """);
                    System.out.println("Escolha uma figura para calcular a área:");
                    
           
           int escolha = scanner.nextInt();

           switch (escolha) {
            case 1:
                System.out.println("Digite a base do Retângulo:");
                int base = scanner.nextInt();
                System.out.println("Digite a altura do Retângulo:");
                int altura = scanner.nextInt();
                Retangulo retangulo = new Retangulo(base, altura);
                System.out.println("A área do Retângulo é: " + retangulo.calcularArea());
                break;

            case 2:
                System.out.println("Digite o lado do Quadrado:");
                int lado = scanner.nextInt();
                Quadrado quadrado = new Quadrado(lado);
                System.out.println("A área do Quadrado é: " + quadrado.calcularArea());
                break;

            case 3:
                System.out.println("Digite o raio do Círculo:");
                int raio = scanner.nextInt();
                Circulo circulo = new Circulo(raio);
                System.out.println("A área do Círculo é: " + circulo.calcularArea());
                break;

            case 0:
                System.out.println("Saindo... Até logo!");
                break;
           
            default:System.out.println("Opção inválida!");
                break;
           }

        } while (scanner.nextInt() != 0);
    }
    }

