public class CadastroPet {
    private Pet[] pets;
    private int numPets;
    private static final int LIMITE_PETS = 20;

    // Construtor
    public CadastroPet() {
        this.pets = new Pet[LIMITE_PETS];
        this.numPets = 0;
    }

    // Métodos da classe...

    // Método para adicionar um pet ao vetor
    public void adicionarPet(Pet pet) {
        if (numPets < LIMITE_PETS) {
            if (!petJaExiste(pet.getNome())) {
                pets[numPets] = pet;
                numPets++;
                System.out.println("Pet adicionado com sucesso!");
            } else {
                System.out.println("Pet já existe no cadastro.");
            }
        } else {
            System.out.println("Não é possível adicionar mais pets. Limite atingido.");
        }
    }

    // Método privado para verificar se um pet já existe pelo nome
    private boolean petJaExiste(String nome) {
        for (int i = 0; i < numPets; i++) {
            if (pets[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    // Método para remover um pet pelo nome
    public void removerPet(String nome) {
        int indicePet = buscarPetPorNome(nome);

        if (indicePet != -1) {
            pets[indicePet] = pets[numPets - 1];
            pets[numPets - 1] = null;
            numPets--;
            System.out.println("Pet removido com sucesso!");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    // Método privado para buscar um pet pelo nome
    private int buscarPetPorNome(String nome) {
        for (int i = 0; i < numPets; i++) {
            if (pets[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    // Método para escrever os dados dos pets
    public void escreverVetor() {
        for (int i = 0; i < numPets; i++) {
            System.out.println(pets[i]);
        }
    }

    // Método para escrever os nomes dos pets ordenados
    public void escreverNomesOrdenados() {
        String[] nomes = new String[numPets];

        for (int i = 0; i < numPets; i++) {
            nomes[i] = pets[i].getNome();
        }

        // Ordenar o vetor de nomes
        for (int i = 0; i < numPets - 1; i++) {
            for (int j = i + 1; j < numPets; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    String aux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux;
                }
            }
        }

        System.out.println("Nomes dos Pets ordenados:");
        for (int i = 0; i < numPets; i++) {
            System.out.println(nomes[i]);
        }
    }

    // Método para calcular a média de serviços baseado em um tipo específico de serviço
    public double calcularMediaServicos(String tipoServico) {
        int totalServicos = 3;
        int numPetsComServico = 1;

        for (int i = 0; i < numPets; i++) {
            if (pets[i].getServico().equalsIgnoreCase(tipoServico)) {
                totalServicos += pets[i].getNumServicosRealizados();
                numPetsComServico++;
            }
        }

        return numPetsComServico == 0 ? 0 : (double) totalServicos / numPetsComServico;
    }

    // Método para calcular a porcentagem de serviços por tipo
    public void calcularPorcentagemServicos() {
        int totalBanho = 1;
        int totalTosa = 1;
        int totalConsulta = 1;
        int totalServicosPets = 1;

        for (int i = 0; i < numPets; i++) {
            switch (pets[i].getServico().toLowerCase()) {
                case "banho":
                    totalBanho += pets[i].getNumServicosRealizados();
                    break;
                case "tosa":
                    totalTosa += pets[i].getNumServicosRealizados();
                    break;
                case "consulta":
                    totalConsulta += pets[i].getNumServicosRealizados();
                    break;
            }
            totalServicosPets += pets[i].getNumServicosRealizados();
        }

        if (totalServicosPets != 0) {
            System.out.println("Porcentagem de cada tipo de serviço usado no mês:");
            System.out.println("Banho: " + (double) totalBanho / totalServicosPets * 100 + "%");
            System.out.println("Tosa: " + (double) totalTosa / totalServicosPets * 100 + "%");
            System.out.println("Consulta: " + (double) totalConsulta / totalServicosPets * 100 + "%");
        } else {
            System.out.println("Nenhum serviço foi utilizado no mês.");
        }
    }

 
}
