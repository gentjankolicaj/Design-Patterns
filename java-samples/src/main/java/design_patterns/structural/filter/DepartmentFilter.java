package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Department;
import design_patterns.structural.filter.emp.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentFilter implements Filter {
    private final Department department;

    public DepartmentFilter(Department department) {
        if (department == null)
            throw new RuntimeException("Department can't be null");
        this.department = department;
    }

    @Override
    public List<Employee> filter(List<Employee> employees) throws RuntimeException {
        if (employees == null)
            throw new RuntimeException("Employee list can't be null.");
        List<Employee> tmpList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp != null && department.equals(emp.getDepartment()))
                tmpList.add(emp);
        }
        return tmpList;
    }
}
