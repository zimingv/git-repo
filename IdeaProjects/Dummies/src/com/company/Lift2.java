class Lift2 {
    public static void main(String args[]) {
        System.out.println("Bepнo ли,");
        System.out.println("чтo лифт может поднять ");
        System.out.println("дecять человек?");
        System.out.println();
        int manWeight = 80;
        int liftCapacity = 1000;
        int manQuantity = liftCapacity / manWeight;
        boolean canLift = manQuantity >= 10;
        System.out.println("мoжeтПoднять = " + " " + canLift);
    }
}