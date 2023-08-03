public class Pessoa {

    // atributos
    private String nome;
    private int cpf;
    private int rg;
    private float telefone;
    private float telefoneEmergencia;
    private String endereco;

    public Pessoa(String nome, int cpf, int rg, float telefone, float telefoneEmergencia, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.telefoneEmergencia = telefoneEmergencia;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }

    public float getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(float telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
