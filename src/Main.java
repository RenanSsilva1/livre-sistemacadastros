import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome : ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade : ");
        int idade = scanner.nextInt();

        System.out.print("Gênero ? : ");
        System.out.print("[Masculino] ou [Feminino]");
        char oritacaoSecual = scanner.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome,idade,oritacaoSecual);
        System.out.println(pessoa.toString());

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa);
    }
}