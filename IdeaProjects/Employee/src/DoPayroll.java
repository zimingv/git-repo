import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        File employeeInfo = new File("EmployeeInfo.txt");
        System.out.println("Поиск " + employeeInfo.getCanonicalPath());


        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);
        }
        diskScanner.close();
    }

    static void payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();

        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}

