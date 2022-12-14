import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -3);
        calendar.add(2, -2);
        Employee employee2 = new Employee(1, "Stoyan Ivanov", 23, calendar.getTime(), 2300.0, 20);
        calendar.add(1, -2);
        Employee employee3 = new Employee(2, "Georgi Ignatov", 32, calendar.getTime(), 3000.0, 20);
        Employee employee1 = new Employee(0, "Ivan Ivanov", 19, new Date(), 1300.0, 20);
        employee1.goOnVacation(3);
        employee2.goOnVacation(10);
        employee3.goOnVacation(12);
        List<Employee> employees = new ArrayList();
        employees.add(employee3);
        employees.add(employee1);
        employees.add(employee2);
        Collections.sort(employees);
        int min = 0;
        int id = 0;
        Iterator var8 = employees.iterator();

        while(var8.hasNext()) {
            Employee e = (Employee)var8.next();
            System.out.println(e);
            if (min > e.getVacationDays()) {
                id = e.getId();
            }
        }

        PrintStream var10000 = System.out;
        Employee var10001 = getEmployeeById(id, employees);
        var10000.println("Employee with min vacation remaining: " + var10001);
        System.out.print("Enter a filename: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            Iterator var11 = employees.iterator();

            while(var11.hasNext()) {
                Employee e = (Employee)var11.next();
                writer.println(e);
            }

            writer.close();
            reader.close();
        } catch (IOException var13) {
            var13.printStackTrace();
        }

    }

    private static Employee getEmployeeById(int id, List<Employee> employees) {
        Iterator var2 = employees.iterator();

        Employee e;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            e = (Employee)var2.next();
        } while(e.getId() != id);

        return e;
    }
}