import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPet cadastro = new CadastroPet();

        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar Pet");
            System.out.println("2. Remover Pet");
            System.out.println("3. Listar Pets");
            System.out.println("4. Listar Nomes Ordenados");
            System.out.println("5. Calcular Média de Serviços");
            System.out.println("6. Calcular Porcentagem de Serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    // Adicionar Pet
                    System.out.println("Digite os dados do Pet:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após o número
                    System.out.print("Nome do Dono: ");
                    String nomeDono = scanner.nextLine();
                    System.out.print("Telefone do Dono: ");
                    String telefoneDono = scanner.nextLine();
                    System.out.print("Serviço: ");
                    String servico = scanner.nextLine();
                    Pet novoPet = new Pet(nome, tipo, raca, idade, nomeDono, telefoneDono, servico);
                    cadastro.adicionarPet(novoPet);
                    break;

                case 2:
                    // Remover Pet
                    System.out.print("Digite o nome do Pet a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    cadastro.removerPet(nomeRemover);
                    break;

                case 3:
                    // Listar Pets
                    cadastro.escreverVetor();
                    break;

                case 4:
                    // Listar Nomes Ordenados
                    cadastro.escreverNomesOrdenados();
                    break;

                case 5:
                    // Calcular Média de Serviços
                    double mediaServicos = cadastro.calcularMediaServicos();
                    System.out.println("Média de serviços utilizados: " + mediaServicos);
                    break;

                case 6:
                    // Calcular Porcentagem de Serviços
                    cadastro.calcularPorcentagemServicos();
                    break;

                case 0:
                    // Sair do programa
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}