/* Para este, adicionei um método withdraw Override na SavingsAccount

A intenção é aplicar as duas funções de saque, sendo que:

 - Na classe Account, o saque possui uma taxa de 5.0
 - Na classe SavingsAccount não há taxa de saque.
 
*/

package secao13.Sobreposição;

import secao13.Upcasting_Downcasting.entities.SavingsAccount;
import secao13.herança.entities.Account;
import secao13.herança.entities.BusinessAccount;


public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
