package Learning2;

public class Manager implements HumanBehaviorInterface {

    private String  code;
    private Integer level;

    public Manager(String code,Integer level){
        this.code = code;
        this.level = level;
    }

    @Override
    public void Eat() {
        System.out.println("Manager eats meat");
    }
}
