package Learning2;

public class Worker implements HumanBehaviorInterface,Cloneable {
    private String name;
    private Integer salary;

    public Worker(String name,Integer salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    protected Worker clone() throws CloneNotSupportedException {
        return (Worker)super.clone();
    }

    @Override
    public void Eat() {
        System.out.println("worker eats bread");
    }

    @Override
    public void outputBaseInfo() {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + ": salay=" + salary);
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
