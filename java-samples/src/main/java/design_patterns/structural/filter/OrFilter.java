package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Employee;

import java.util.List;

public class OrFilter implements Filter {

    private final Filter filterOne;
    private final Filter filterTwo;

    public OrFilter(Filter filterOne, Filter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }


    @Override
    public List<Employee> filter(List<Employee> employees) throws RuntimeException {
        if (employees == null)
            throw new RuntimeException("Employees list can't be null");

        List<Employee> firstFiltratedEmployees = filterOne.filter(employees);
        List<Employee> secondFiltratedEmployees = filterTwo.filter(employees);
        if (firstFiltratedEmployees == null && secondFiltratedEmployees == null)
            throw new RuntimeException("No employee passed first & second filter");

        else if (firstFiltratedEmployees == null)
            return secondFiltratedEmployees;

        else if (secondFiltratedEmployees == null)
            return firstFiltratedEmployees;

        else {
            for (int i = 0; i < firstFiltratedEmployees.size(); i++) {
                Employee tmpEmployee = firstFiltratedEmployees.get(i);
                if (!secondFiltratedEmployees.contains(tmpEmployee))
                    secondFiltratedEmployees.add(tmpEmployee);
            }
            return secondFiltratedEmployees;
        }


    }
}
