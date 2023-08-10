public class Main {
    public static void main(String[] args) {

        // construindo balões
        Balao b1 = new Balao();

        Balao b2 = new Balao(2, "público","azul","quadrado", 3.00, 60.00,"grande", 4);
        Balao b3 = new Balao(3, "particular","verde","triângulo",2.32,62.25,"médio",5);

        // construindo pessoas
        Pessoa p1 = new Pessoa("italo",569058,427610,11951583648f,11964823157f,"rua jaci");
        Pessoa p2 = new Pessoa("monteiro",208437,704138,11919753412f,11924963276f,"rua dalva");

        // construindo pilotos
        Piloto pi1 = new Piloto("jublisqueitison", 248187, 3972);
        Piloto pi2 = new Piloto("aline", 704268, 6104);
    }
}