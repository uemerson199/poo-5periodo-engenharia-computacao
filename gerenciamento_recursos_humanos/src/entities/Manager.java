package entities;


public class Manager extends Employee{


    private String department;
    public Manager(){


    }


    public Manager(String name, Integer id, Double salary, String department) {
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
        return "Gerenciar todos os funcionarios do seu setor.";
    }


    @Override
    public String toString() {
        return "Nome do funcionario: " + name + ", salario: " + salary + ", id: " + id + ", tarefa: " + descricaoTarefas()
                + ", departamento: " + getDepartment();
    }


}




