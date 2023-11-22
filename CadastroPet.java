public class CadastroPet {
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
            // Verificar se o pet já existe no vetor
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
    public double calcularMediaServicos() {
        int totalServicos = 0;

        for (int i = 0; i < numPets; i++) {
            totalServicos += pets[i].getNumServicosRealizados();
        }

        return (double) totalServicos / numPets;
    }

    // Método privado para verificar se o pet já existe no vetor
    private boolean petJaExiste(String nome) {
        for (int i = 0; i < numPets; i++) {
            if (pets[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }   

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

    private int buscarPetPorNome(String nome) {
        for (int i = 0; i < numPets; i++) {
            if (pets[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void escreverVetor() {
        for (int i = 0; i < numPets; i++) {
            System.out.println(pets[i]);
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
