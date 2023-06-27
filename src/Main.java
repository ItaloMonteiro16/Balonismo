public class Main {
    public static void main(String[] args) {

        // construindo balões
        Balao b1 = new Balao();

        // chamando o método voar()
        String resultado = b1.voar(new combustivel());

        // exibindo o resultado do voo
        System.out.println(resultado);

        Balao b2 = new Balao(2, "oi","azul","quadrado", 63.00, 10.00,"forte", 4);

    }
}