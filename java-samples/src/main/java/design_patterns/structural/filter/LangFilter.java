package design_patterns.structural.filter;

import design_patterns.structural.filter.emp.Employee;
import design_patterns.structural.filter.emp.Lang;

import java.util.ArrayList;
import java.util.List;

public class LangFilter implements Filter {
    private final Lang lang;

    public LangFilter(Lang lang) {
        if (lang == null)
            throw new RuntimeException("Lang can't be null");
        this.lang = lang;
    }

    @Override
    public List<Employee> filter(List<Employee> employees) throws RuntimeException {
        if (employees == null)
            throw new RuntimeException("Employee list can't be null.");

        List<Employee> tmpList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp != null && lang.equals(emp.getLang()))
                tmpList.add(emp);
        }
        return tmpList;
    }

}
