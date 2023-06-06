public class Balao {

    // atributos
    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidadePessoa;

    // metodos
    public String voar(combustivel gasPropano) {
        return "voando com " + gasPropano;
    }
}
