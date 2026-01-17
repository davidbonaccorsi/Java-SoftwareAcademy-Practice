package Chapter10.e5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HRAnalytics {

        public record Employee(String name, String department, double salary, int yearsOfExperience) {}

        /**
         * Method 1: Group Employees by Department
         *
         * REQUIREMENTS:
         * 1. Return a Map where the Key is the Department name.
         * 2. The Value is the List of Employees in that department.
         */
        public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {

            if(employees==null){
                return new HashMap<>();
            }

            return employees
                    .stream()
                    .collect(Collectors.groupingBy(Employee::department));
        }

        /**
         * Method 2: Average Salary per Department
         *
         * REQUIREMENTS:
         * 1. Return a Map where the Key is the Department name.
         * 2. The Value is the AVERAGE salary of that department.
         *
         * Hint: Collectors.groupingBy(..., Collectors.averagingDouble(...))
         */
        public Map<String, Double> getAverageSalaryByDept(List<Employee> employees) {

            return employees.stream()
                    .collect(Collectors
                            .groupingBy(Employee::department,
                                    Collectors.averagingDouble(Employee::salary)
                            )
                    );


        }

        /**
         * Method 3: Senior vs Junior Partition
         *
         * REQUIREMENTS:
         * 1. Split the employees into two lists (Partitioning).
         * 2. 'True' list: Employees with >= 10 years experience.
         * 3. 'False' list: Employees with < 10 years experience.
         */
        public Map<Boolean, List<Employee>> partitionBySeniority(List<Employee> employees) {

            return employees.stream()
                    .collect(Collectors.partitioningBy(e -> e.yearsOfExperience() >= 10));

        }
}
