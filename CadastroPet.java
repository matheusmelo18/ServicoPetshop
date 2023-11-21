class CadastroPet {
    private Pet[] pets;
    private int numPets;

    // Construtor
    public CadastroPet() {
        this.pets = new Pet[20];
        this.numPets = 0;
    }

    // Método para adicionar um pet ao vetor
    public void adicionarPet(Pet pet) {
        if (numPets < 20) {
            pets[numPets] = pet;
            numPets++;
            System.out.println("Pet adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais pets. Limite atingido.");
        }
    }

    public void removerPet(String nome) {
        for (int i = 0; i < numPets; i++) {
            if (pets[i].getNome().equals(nome)) {
                pets[i] = pets[numPets - 1];
                pets[numPets - 1] = null;
                numPets--;
                System.out.println("Pet removido com sucesso!");
                return;
            }
        }
        System.out.println("Pet não encontrado.");
    }

    public void escreverVetor() {
        for (int i = 0; i < numPets; i++) {
            System.out.println("Pet " + pets[i].getNome() +
                    " está na posição " + (i + 1) + " do vetor.");
        }
    }

    public void calcularPorcentagemServicos() {
        int[] totalServicos = new int[6];

        for (int i = 0; i < numPets; i++) {
            for (int j = 0; j < pets[i].getServicosUtilizados().length; j++) {
                totalServicos[j] += pets[i].getServicosUtilizados()[j];
            }
        }

        System.out.println("Porcentagem de cada serviço usado no mês:");
        for (int i = 0; i < totalServicos.length; i++) {
            double porcentagem = (double) totalServicos[i] / (numPets * pets[0].getNumServicosRealizados()) * 100;
            System.out.println("Serviço " + (i + 1) + ": " + porcentagem + "%");
        }
    }

    // Método para indicar em que posição do vetor os pets estão
    public void indicarPosicaoPets() {
        for (int i = 0; i < numPets; i++) {
            System.out.println("Pet " + pets[i].getNome() +
                    " está na posição " + (i + 1) + " do vetor.");
        }
    }
}

