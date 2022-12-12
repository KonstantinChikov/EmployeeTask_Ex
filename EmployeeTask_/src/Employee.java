import java.util.Date;

public class Employee extends Person implements Comparable<Employee> {
    private final int id;
    private final Date signedDate;
    private double salary;
    private int vacation;

    public Employee(int id, String name, int age, Date signedDate, double salary, int vacation) {
        super(age, name);
        this.id = id;
        this.signedDate = signedDate;
        this.salary = salary;
        this.vacation = vacation;
    }

    public int compareTo(Employee o) {
        return this.signedDate.compareTo(o.signedDate);
    }

    public Date getSignedDate() {
        return this.signedDate;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setVacationDays(int vacation) {
        this.vacation = vacation;
    }

    public int getVacationDays() {
        return this.vacation;
    }

    public boolean goOnVacation(int days) {
        if (this.vacation < days) {
            return false;
        } else {
            this.vacation -= days;
            return true;
        }
    }

    public String toString() {
        int var10000 = this.id;
        return "id=" + var10000 + ", name=" + super.getName() + ", age=" + super.getAge() + ", signedDate=" + this.signedDate + ", salary=" + this.salary + ", vacation=" + this.vacation;
    }
}
