package Learning0207;

public class Cat extends Animal {

    private String furColor;

    public Cat(String name,Integer age)
    {
        super(name,age,"Cat-Class");
        furColor = "white";
    }

    @Override
    public void move() {
        System.out.println(super.name+ " is walkking");
    }

    @Override
    public void eat() {
        System.out.println(super.name+ " is eatting fish");
    }

    public void getFurColor()
    {
        System.out.println(super.name+ " is " + furColor);
    }
}
