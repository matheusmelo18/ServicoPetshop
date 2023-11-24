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
    private String servico;

    // Construtor
    public Pet(String nome, String tipo, String raca, int idade, String nomeDono, String telefoneDono, String servico) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.agendamentoServicos = new String[6];
        this.servicosUtilizados = new int[6];
        this.numServicosRealizados = 0;
        this.servico = servico;
    }

    // Métodos getters e setters...
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getTelefoneDono() {
        return telefoneDono;
    }

    public void setTelefoneDono(String telefoneDono) {
        this.telefoneDono = telefoneDono;
    }

    public String[] getAgendamentoServicos() {
        return agendamentoServicos;
    }

    public void setAgendamentoServicos(String[] agendamentoServicos) {
        this.agendamentoServicos = agendamentoServicos;
    }

    public int[] getServicosUtilizados() {
        return servicosUtilizados;
    }

    public void setServicosUtilizados(int[] servicosUtilizados) {
        this.servicosUtilizados = servicosUtilizados;
    }

    public int getNumServicosRealizados() {
        return numServicosRealizados;
    }

    public void setNumServicosRealizados(int numServicosRealizados) {
        this.numServicosRealizados = numServicosRealizados;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
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
                ", tipo de serviço='" + servico + '\'' +
                '}';
    }
}
