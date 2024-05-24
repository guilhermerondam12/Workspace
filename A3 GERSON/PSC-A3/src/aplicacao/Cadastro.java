
package aplicacao;

import GerenciamentoCadastro.Paciente;
import java.util.Scanner;


public class Cadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char resposta = 's';
        Paciente paciente = new Paciente ();
        
        while (resposta == 's' || resposta == 'S') {
            System.out.println("Digite o nome ");
            String nome = teclado.nextLine();
            System.out.println("Digite a idade: ");
            int idade = teclado.nextInt();
            paciente.setNome(nome);
            paciente.setIdade(idade);
            System.out.println("Deseja continuar? S/N");
            resposta = teclado.next().charAt(0);
            System.out.println(paciente);
        }
    }
}
