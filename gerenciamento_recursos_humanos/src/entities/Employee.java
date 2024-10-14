package entities;


import java.util.ArrayList;
import java.util.List;


public class Employee {
    protected String name;
    protected Integer id;
    protected Double salary;


    List<Employee> employeeList = new ArrayList<>();


    public Employee(){


    }


    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Double getSalary() {
        return salary;
    }


    public void addSalary(Double salary) {
        this.salary += salary;
    }


    public Double salaryBonus(){
        return salary;
    }


    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


    public void removeEmployee(int idR){
        idR--;
        employeeList.remove(idR);
    }


    public void atualizarEmployee(Employee emp, int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.set(i, emp);
            }
        }
    }


    public void listarEmployees(){
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }


    public String descricaoTarefas(){
        return "Faz uma terefa não especifica!";
    }


    @Override
    public String toString() {
        return "Nome do funcionario: " + name + ", salario: " + salary + ", id: " + id ;
    }
}
