package Learning2;

public interface HumanBehaviorInterface {

    public default void Eat(){ System.out.println("eat...");}
    public default void Lie(){ System.out.println("lie...");}
    public default void Move(){ System.out.println("Move...");}
    public default void Think(){ System.out.println("Think...");}
    public default void Entertainment(){ System.out.println("Entertainment...");}
    public default void outputBaseInfo(){}
}
