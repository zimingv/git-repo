public class UseStudentNice {
    public static void main(String[] args) {
        StudentNice st1 = new StudentNice();
        st1.setName("Ivan Drago");
        st1.setID(111);
        st1.setGPA(3.5);
        st1.setMajor(Profile.ИСТОРИЯ);
        System.out.println(st1.getString());

        StudentNice st2 = new StudentNice("Rocky Balboa", 222);
        System.out.println(st2.getString());

        StudentNice st3 = new StudentNice("Bruce Lee", 333, 1.7, Profile.ФИЗИКА);
        System.out.println(st3.getString());
    }
}
