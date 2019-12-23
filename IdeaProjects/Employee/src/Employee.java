public class Employee {
    private String name, jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void cutCheck(double amountPaid) {
        System.out.printf("Выплатить служащему %s ", name);
        System.out.printf("(%s) ***$", jobTitle);
        System.out.printf("%,.2f\n", amountPaid);
    }
}
