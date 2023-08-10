public class Piloto {

    // atributos
    private String nome;
    private int cpf;
    private int numAnac;

    public Piloto(String nome, int cpf, int numAnac) {
        this.nome = nome;
        this.cpf = cpf;
        this.numAnac = numAnac;
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

    public int getNumAnac() {
        return numAnac;
    }

    public void setNumAnac(int numAnac) {
        this.numAnac = numAnac;
    }
}
