/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
*/

package secao10;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Pessoa;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i<n; i++) {
            System.out.println("Dados da "+ (i + 1) + "a pessoa:");
            System.out.println("Nome: ");
            String name = sc.nextLine();

            sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(name, idade, altura);
        }

        double somaAlturas = 0;
        
        int pessoasMenores16 = 0;
        for (int i = 0; i < n; i++) {
            somaAlturas += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                pessoasMenores16++;
            }
        }

        double alturaMedia = somaAlturas / n;

        double porcentagem = 100.00 * pessoasMenores16 / n;

        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
