package ads.poo;

public class App {

    private Agenda agenda = new Agenda();
    public static void main(String[] args) {

        System.out.println("Bem vindo(a) à sua agenda!");

    }

    public void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato");
        System.out.println("3 - Remover contato");
        System.out.println("4 - Adicionar telefone");
        System.out.println("5 - Remover telefone");
        System.out.println("6 - Atualizar telefone");
        System.out.println("7 - Sair");
    }
}
