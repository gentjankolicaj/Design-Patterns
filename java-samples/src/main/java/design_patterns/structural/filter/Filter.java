package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Employee;

import java.util.List;

public interface Filter {

    List<Employee> filter(List<Employee> employees) throws RuntimeException;

}
