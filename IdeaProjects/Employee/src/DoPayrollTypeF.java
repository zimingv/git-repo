public class DoPayrollTypeF {
    public static void main(String[] args) {

        FullTimeEmployee ftEmployee = new FullTimeEmployee();

        ftEmployee.setName("Barry Berd");
        ftEmployee.setJobTitle("Director");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(300.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();

        PartTimeEmployee ptEmployee = new PartTimeEmployee();

        ptEmployee.setName("Gordon Freeman");
        ptEmployee.setJobTitle("It is hero!");
        ptEmployee.setHourlyRate(10.10);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));
        System.out.println();

        PartTimeWithOver ptoEmployee = new PartTimeWithOver();

        ptoEmployee.setName("Cris Norman");
        ptoEmployee.setJobTitle("Computerscience book author");
        ptoEmployee.setHourlyRate(10.10);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));
    }
}
