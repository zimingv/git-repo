public class Organization {
    String name;
    int cash;
    boolean commerc;

    public void dislplay() {
        System.out.println("Наименование компании - " + name);
        System.out.println("Баланс расчетного счета = " + cash);
        System.out.println("Коммерческого типа - " + commerc);
    }

    public int getTax (int taxRate) {
        return cash*taxRate/100;
    }
}
