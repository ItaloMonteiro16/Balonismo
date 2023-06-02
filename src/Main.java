public class Main {
    public static void main(String[] args) {

        Pessoa obj1 = new Pessoa();
        obj1.nome = "italo monteiro";
        obj1.cpf = "259.536.173-03";
        obj1.rg = "15 892 247-2";
        obj1.telefone = "(11) 9 5158-3648";
        obj1.telefoneEmergencia = "(11) 9 2484-0511";
        obj1.endereco = "rua jaci 30";

        System.out.println("nome: " + obj1.nome);
        System.out.println("cpf: " + obj1.cpf);
        System.out.println("rg: " + obj1.rg);
        System.out.println("telefone: " + obj1.telefone);
        System.out.println("telefone para emergencia: " + obj1.telefoneEmergencia);
        System.out.println("endereço: " + obj1.endereco);

    }
}