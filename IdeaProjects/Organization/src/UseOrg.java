public class UseOrg {
    public static void main(String[] args) {
        Organization Comercial = new Organization();
        Organization Goverment = new Organization();

        Comercial.name = "OMC";
        Comercial.cash = 100000;
        Comercial.commerc = true;

        Goverment.name = "MUP Tram Control";
        Goverment.cash = 15000;
        Goverment.commerc = false;

        Comercial.dislplay();
        System.out.println("Сумма налогов к уплате = " + Comercial.getTax(10));
        System.out.println();


        Goverment.dislplay();
        System.out.println("Сумма налогов к уплате = " + Goverment.getTax(2));
        System.out.println();
    }

}

