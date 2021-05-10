package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Department;
import design_patterns.structural.filter.emp.Employee;
import design_patterns.structural.filter.emp.Gender;
import design_patterns.structural.filter.emp.Lang;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        List<Employee> employees = produceEmployees(15);

        GenderFilter maleFilter = new GenderFilter(Gender.MALE);
        GenderFilter femaleFilter = new GenderFilter(Gender.FEMALE);

        DepartmentFilter ITFilter = new DepartmentFilter(Department.IT);
        DepartmentFilter marketingFilter = new DepartmentFilter(Department.MARKETING);

        AndFilter maleIT = new AndFilter(maleFilter, ITFilter);
        AndFilter femaleMarketing = new AndFilter(femaleFilter, marketingFilter);


        System.out.println("Male filters : ");
        List<Employee> maleList = maleFilter.filter(employees);
        for (Employee employee : maleList)
            System.out.println(employee);


        System.out.println("Female filters : ");
        List<Employee> femaleList = femaleFilter.filter(employees);
        for (Employee employee : femaleList)
            System.out.println(employee);


        System.out.println("IT filter : ");
        List<Employee> itList = ITFilter.filter(employees);
        for (Employee employee : itList)
            System.out.println(employee);


        System.out.println("Male it filter : ");
        List<Employee> maleITList = maleIT.filter(employees);
        for (Employee employee : maleITList)
            System.out.println(employee);


        System.out.println("Male marketing filter : ");
        List<Employee> maleMarketing = (new AndFilter(maleFilter, marketingFilter)).filter(employees);
        for (Employee employee : maleMarketing)
            System.out.println(employee);

        System.out.println("Female or IT filter : ");
        List<Employee> femaleOrIT = (new OrFilter(femaleFilter, ITFilter)).filter(employees);
        for (Employee employee : femaleOrIT)
            System.out.println(employee);

        System.out.println("Female && IT filter : ");
        List<Employee> femaleAndIT = (new AndFilter(femaleFilter, ITFilter)).filter(employees);
        for (Employee employee : femaleAndIT)
            System.out.println(employee);


    }


    static List<Employee> produceEmployees(int amount) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            Gender gender = Gender.MALE;
            Department department = Department.IT;
            Lang lang = Lang.GER;
            if (i % 2 == 0) {
                gender = Gender.FEMALE;
                department = Department.MARKETING;
                lang = Lang.ITA;
            }
            Employee newEmployee = new Employee(i, "Emp " + i, gender, 1000f, department, lang);
            employees.add(newEmployee);
        }
        return employees;
    }
}
