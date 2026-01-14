/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis)
*/

package secao10;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Aluno;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno[] vect = new Aluno[n];

        for (int i = 0; i< n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String name = sc.nextLine();
            double primeiraNota = sc.nextDouble();
            double segundaNota = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Aluno(name, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            if (vect[i].getMedia() >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
