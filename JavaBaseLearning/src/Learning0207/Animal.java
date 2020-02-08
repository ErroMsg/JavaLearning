package Learning0207;

public abstract class Animal implements AnimalInterface {
    protected String name = "unknown";
    protected Integer age = 0;
    protected String classname = "unknown";

    public Animal(String name,Integer age,String classname){
        this.name = name;
        this.age = age;
        this.classname = classname;
    }

//    public abstract void move();
//    public abstract void eat();
    public  void getAge() {
        System.out.println(this.name+ " is " + age + " years old");
    }

    public  void getClassName() {
        System.out.println(this.name+ " is belong to " + classname);
    }

}
