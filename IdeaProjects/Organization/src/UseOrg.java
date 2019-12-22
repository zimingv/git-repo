public class UseOrg {
    public static void main(String[] args) {
        Organization Comercial = new Organization();
        Organization Goverment = new Organization();

        Comercial.setName("");
        Comercial.setCash(-100000);
        Comercial.setCommerc(true);

        Goverment.setName("MUP Tram Control");
        Goverment.setCash(15000);
        Goverment.setCommerc(false);

        Comercial.dislplay();
        System.out.println("Сумма налогов к уплате = " + Comercial.getTax(10));
        System.out.println();


        Goverment.dislplay();
        System.out.println("Сумма налогов к уплате = " + Goverment.getTax(2));
        System.out.println();
    }

}

