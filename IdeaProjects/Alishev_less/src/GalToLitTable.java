public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter=0;
        for (gallons=1; gallons<=100; gallons++) {
            liters = gallons * 3.7854; //Преобразовать галлоны в литры
            System.out.println(gallons + " галлонам соответствует " + liters + " литров.");
            counter++;
            if (counter == 10) {
                System.out.println(); // если счетчик равен 10 вывести пустую строку
                counter = 0;  //сбросить счетчик строк
            }
        }
    }
}
