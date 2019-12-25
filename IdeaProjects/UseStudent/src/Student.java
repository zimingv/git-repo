public class Student {
    private String name;
    private int ID;
    private double GPA;
    private Profile major;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setGPA(double GPA) {
        if (GPA > 0.0 & GPA <= 4.0) {
            this.GPA = GPA;
        } else {
            System.out.println("Средний бал успеваемости (GPA) должен быть в пределах от 0.0 до 4.0!");
        }
    }

    public double getGPA() {
        return GPA;
    }

    public void setMajor(Profile major) {
        this.major = major;
    }

    public Profile getMajor() {
        return major;
    }

    public Student() {
        System.out.println("Вы не указали имя и ID студента");
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student(String name, int ID, double GPA, Profile major) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
        this.major = major;
    }
}
