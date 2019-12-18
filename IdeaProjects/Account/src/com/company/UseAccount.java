
public class UseAccount {

    public static void main(String args[]) {
        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Барри Берд";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Джейн Смит";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        myAccount.display();

        System.out.print(" плюс ");
        System.out.printf("$%4.2f", myAccount.getInterest(10.00));
        System.out.print(" дохода ");

        System.out.println();
        System.out.println();

        yourAccount.display();

        double yourInterestRate = 100.00;
        System.out.print(" плюс $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.print(" дохода ");
    }
}
