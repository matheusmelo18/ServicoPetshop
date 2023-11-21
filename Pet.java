class Pet {
    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String nomeDono;
    private String telefoneDono;
    private String[] agendamentoServicos;
    private int[] servicosUtilizados;
    private int numServicosRealizados;
    private 

    // Construtor
    public Pet(String nome, String tipo, String raca, int idade, String nomeDono, String telefoneDono) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.agendamentoServicos = new String[6];
        this.servicosUtilizados = new int[6];
        this.numServicosRealizados = 0;
    }

    // Métodos para registrar informações do pet
    public void alterarTelefone(String novoTelefone) {
        this.telefoneDono = novoTelefone;
    }

    public void alterarAgendamento(String[] novoAgendamento) {
        // Copiar os elementos do novoAgendamento para o agendamentoServicos
        for (int i = 0; i < novoAgendamento.length; i++) {
            this.agendamentoServicos[i] = novoAgendamento[i];
        }
    }

    public void alterarServicosUtilizados(int[] novosServicos) {
        // Copiar os elementos do novosServicos para o servicosUtilizados
        for (int i = 0; i < novosServicos.length; i++) {
            this.servicosUtilizados[i] = novosServicos[i];
        }
    }

    public void registrarServicoRealizado() {
        this.numServicosRealizados++;
    }

    // Método para calcular o valor total a ser pago pelos serviços do mês
    public double calcularValorTotal() {
        // Defina os preços para cada serviço (exemplo)
        double[] precos = {10.0, 15.0, 5.0, 20.0, 8.0, 12.0};

        double valorTotal = 0.0;
        for (int i = 0; i < agendamentoServicos.length; i++) {
            valorTotal += servicosUtilizados[i] * precos[i];
        }

        return valorTotal;
    }

    // Método toString para fornecer um resumo das informações do pet
    @Override
    public String toString() {
        StringBuilder agendamentoStr = new StringBuilder("[");
        for (int i = 0; i < agendamentoServicos.length; i++) {
            agendamentoStr.append(agendamentoServicos[i]);
            if (i < agendamentoServicos.length - 1) {
                agendamentoStr.append(", ");
            }
        }
        agendamentoStr.append("]");

        StringBuilder servicosStr = new StringBuilder("[");
        for (int i = 0; i < servicosUtilizados.length; i++) {
            servicosStr.append(servicosUtilizados[i]);
            if (i < servicosUtilizados.length - 1) {
                servicosStr.append(", ");
            }
        }
        servicosStr.append("]");

        return "Pet: " + nome + ", Tipo: " + tipo + ", Raça: " + raca + ", Idade: " + idade +
                ", Dono: " + nomeDono + ", Telefone: " + telefoneDono +
                "\nAgendamento de Serviços: " + agendamentoStr.toString() +
                "\nServiços Utilizados: " + servicosStr.toString() +
                "\nNúmero de Serviços Realizados no Mês: " + numServicosRealizados;
    }
}
