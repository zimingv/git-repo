public class UseStudent {
    public static void main(String[] args) {
        final String formatType1 = "Имя студента - %s, ID студента - %d, Средний бал = %2.1f, Специальность - %s\n";
        final String formatType2 = "Имя студента - %s, ID студента - %d\n";
        Student st1 = new Student();
        st1.setName("Ivan Drago");
        st1.setID(111);
        st1.setGPA(3.5);
        st1.setMajor(Profile.ИСТОРИЯ);
        System.out.printf(formatType1, st1.getName(), st1.getID(), st1.getGPA(), st1.getMajor());

        Student st2 = new Student("Rocky Balboa", 222);
        System.out.printf(formatType2, st2.getName(), st2.getID());

        Student st3 = new Student("Bruce Lee", 333, 1.7, Profile.ФИЗИКА);
        System.out.printf(formatType1, st3.getName(), st3.getID(), st3.getGPA(), st3.getMajor());
    }
}
