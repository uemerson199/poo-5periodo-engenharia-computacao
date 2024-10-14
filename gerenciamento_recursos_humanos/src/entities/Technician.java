package entities;


public class Technician extends Employee{


    private String department;


    public Technician(){


    }


    public Technician(String name, Integer id, Double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public void addSalary(Double salary) {
        this.salary += salary;
    }


    @Override
    public String descricaoTarefas(){
        return "Responsável pelo setor técnico a qual está encarregado";
    }




    @Override
    public String toString() {
        return "Nome do funcionario: " + name + ", salario: " + salary + ", id: " + id + ", tarefa: " + descricaoTarefas()
                + ", departamento: " + getDepartment();
    }


}