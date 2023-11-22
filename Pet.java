

public class Pet {
    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String nomeDono;
    private String telefoneDono;    
    private String[] agendamentoServicos;
    private int[] servicosUtilizados;
    private int numServicosRealizados;

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

    // Métodos getters
    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNomeDono() {
        return this.nomeDono;
    }

    public String getTelefoneDono() {
        return this.telefoneDono;
    }

    public String[] getAgendamentoServicos() {
        return this.agendamentoServicos;
    }

    public int[] getServicosUtilizados() {
        return this.servicosUtilizados;
    }

    public int getNumServicosRealizados() {
        return this.numServicosRealizados;
    }
      @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", nomeDono='" + nomeDono + '\'' +
                ", telefoneDono='" + telefoneDono + '\'' +
                ", agendamentoServicos=" + (agendamentoServicos) +
                ", servicosUtilizados=" + (servicosUtilizados) +
                ", numServicosRealizados=" + numServicosRealizados +
                '}';
    }
}

   
