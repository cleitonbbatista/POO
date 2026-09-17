package ads.poo;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    HashMap<String, Livro> biblioteca = new HashMap<>();

    public static void main(String[] args) {

        App app = new App();
        app.cadastrar();
        app.listar();
        app.consultaIsbn();

    }

    public void cadastrar(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o ISBN do livro:");
        String isbn = teclado.nextLine();
        if (biblioteca.get(isbn) != null) {
            System.out.println("ISBN não é válido, tente novamente.");
            teclado.close();
            return;
        }

        System.out.println("Entre com o título do livro:");
        String titulo = teclado.nextLine();

        System.out.println("Entre com o autor do livro:");
        String autor = teclado.nextLine();

        System.out.println("Entre com o ano de publicação do livro:");
        int ano = teclado.nextInt();

        Livro l = new Livro(isbn, titulo, autor, ano);

        biblioteca.put(l.getIsbn(), l);
        System.out.println("Cadastrado com sucesso!");
        
        teclado.close();
        return;

    }

    public void listar(){
        
        biblioteca.forEach((i,l) -> System.out.println("ISBN: " + i + " | Título: " + l.getTitulo()));
    
    }

    public void consultaIsbn(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o ISBN exato para a pesquisa:");
        String i = teclado.nextLine();
        
        teclado.close();

        System.out.println(biblioteca.get(i));

    }

    public void consultaAutor(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o nome do autor:");
        String a = teclado.nextLine();

        teclado.close();

        biblioteca.forEach((i,l) -> {
            if (l.getAutor() == a) {
                System.out.println("O autor " + a + " possui o livro " + l.getTitulo() + " de ISBN " + i);
            }
        });

    }

    public void consultaAno(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o ano de publicação:");
        int a = teclado.nextInt();

        teclado.close();

        biblioteca.forEach((i,l) -> {
            if (l.getAno() == a) {
                System.out.println("No ano " + a + " foi publicado o livro " + l.getTitulo() + " de ISBN " + i);
            }
        });

    }

    public void atualizar(){

        // TODO Ajustar

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o ISBN do livro que deseja atualizar: ");
        String i = teclado.nextLine();
        Livro l = biblioteca.get(i);
        if ( l == null) {
            System.out.println("Não existe livro com esse ISBN!");
            teclado.close();
            return;
        }

        System.out.println("Insira o título:");
        String t = teclado.nextLine();
        if (!t.isEmpty()){
            l.setTitulo(t);
        }

        System.out.println("Insira o nome do autor:");
        String a = teclado.nextLine();

        System.out.println("Insira o ano de publicação:");
        int ano = teclado.nextInt();

        teclado.close();

    }
}
