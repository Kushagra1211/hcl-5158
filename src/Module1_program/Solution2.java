package Module1_program;

import java.util.*;

class Employee {
    int id;
    String name;
    public Employee(int n,String name)
    {
      this.id =n;
      this.name=name;
    }
}
public class Solution2 {
    public static void main(String[] args) {
    Employee e1 = new Employee(1,"Aman");
    Employee e2= new Employee(3,"Naman");
    Employee e3= new Employee(4,"Samarth");
    Employee e4= new Employee(2,"Divyansh");
    ArrayList<Employee> employees = new ArrayList();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    employees.add(e4);
    Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee e = it.next();

            System.out.println(e.id + ":" + e.name);
        }
        Collections.sort(employees,
                Comparator.comparingInt(( e) -> e.id));
        System.out.println("Ascending Order");
        for(Employee e:employees) {
            System.out.println(e.id+":"+e.name);
        }
        System.out.println("Descending Order");
        Collections.sort(employees,
                Comparator.comparingInt((Employee e) -> e.id).reversed());
        for(Employee e:employees) {
            System.out.println(e.id+":"+e.name);
        }
    }
}
