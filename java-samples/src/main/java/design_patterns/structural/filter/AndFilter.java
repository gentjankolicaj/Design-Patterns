package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Employee;

import java.util.List;

public class AndFilter implements Filter {
    private final Filter filterOne;
    private final Filter filterTwo;

    public AndFilter(Filter filterOne, Filter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<Employee> filter(List<Employee> employees) throws RuntimeException {
        if (employees == null)
            throw new RuntimeException("Employee list can't be null.");

        List<Employee> firstFiltratedEmployees = filterOne.filter(employees);
        if (firstFiltratedEmployees == null)
            throw new RuntimeException("Can't process with second filter because no employee passed first filter");

        List<Employee> secondFiltratedEmployees = filterTwo.filter(firstFiltratedEmployees);
        return secondFiltratedEmployees;
    }
}
