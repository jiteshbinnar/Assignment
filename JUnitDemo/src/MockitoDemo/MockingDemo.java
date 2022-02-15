package MockitoDemo;

import org.junit.Before;
import org.mockito.Mockito;

public class MockingDemo {


@Before
    public void setUp()
    {
        EmployeeService employeeService=new EmployeeService();
        employeeService= Mockito.mock(EmployeeService.class);
        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.setEmployeeService(employeeService);
    }
}
