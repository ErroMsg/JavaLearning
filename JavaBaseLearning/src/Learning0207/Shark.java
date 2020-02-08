package Learning0207;

public class Shark extends Animal {

    private Integer bodyLength;

    public Shark(String name,Integer age)
    {
        super(name,age,"Fish-Class");

        bodyLength = 19;
    }

    @Override
    public void move() {
        System.out.println(super.name+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(super.name+ " is eatting meat");
    }

    public void getBodyLength()
    {
        System.out.println(super.name+ " is " + bodyLength + "m long");
    }
}
