public class UseStudent {
    public static void main(String[] args) {
        System.out.println("Имя студента" + " " + "ID студента" + " " + "Средний бал" + " " + "Специальность");
        Student st1 = new Student();
        st1.setName("Ivan Drago");
        st1.setID(111);
        st1.setGPA(3.5);
        st1.setMajor(Profile.ИСТОРИЯ);
        System.out.println(st1.getName() + " " + st1.getID() + " " + st1.getGPA() + " " + st1.getMajor());

        Student st2 = new Student("Rocky Balboa", 222);
        System.out.println(st2.getName() + " " + st2.getID());

        Student st3 = new Student("Bruce Lee", 333, 1.7, Profile.ФИЗИКА);
        System.out.println(st3.getName() + " " + st3.getID() + " " + st3.getGPA() + " " + st3.getMajor());
    }
}
