import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class Employee extends Person   {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
    private long employeeId;
    private String departmentName;

@OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            targetEntity = ContactDetails.class,
            fetch = FetchType.LAZY)
    private List<ContactDetails> contactDetails;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", departmentName='" + departmentName + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(departmentName, employee.departmentName) && Objects.equals(laptop, employee.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, departmentName, laptop);
    }

    public Employee() {
        super();

    }
}
