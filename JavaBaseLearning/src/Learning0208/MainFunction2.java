package Learning0208;

public class MainFunction2 {

    //可变参数函数
    public static void printArgsFunction(String ... values){
        for(String var : values)
            System.out.println("arg = " + var);
    }
}