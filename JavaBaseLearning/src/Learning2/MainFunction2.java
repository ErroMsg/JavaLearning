package Learning2;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFunction2 {

    //可变参数函数
    public static void printArgsFunction(String ... values){
        for(String var : values)
            System.out.println("arg = " + var);
    }

    public static void interfaceTestCode(){
        HumanBehaviorInterface humnan = new Manager("9527",1);
        humnan.Eat();

        HumanBehaviorInterface worker = new Worker("Frank",99);
        worker.Eat();

    }

    public static void cloneTest() throws CloneNotSupportedException{
        Worker origin = new Worker("Frank",99);
        Worker copy = origin.clone();

        origin.setSalary(100);
        origin.outputBaseInfo();
        copy.outputBaseInfo();

    }

    public static void LamdaTest(){
        String []stringlist = new String[] {
                "EEEEccccc","Ac","Bee","C","DF333","123"
        };

        System.out.println(Arrays.toString(stringlist));
        System.out.println("Begin sort...");
        Arrays.sort(stringlist);
        System.out.println(Arrays.toString(stringlist));

        System.out.println(" sort by len...");
        Arrays.sort(stringlist,(String first,String second)->
                (second.length() - first.length() ));

        System.out.println(Arrays.toString(stringlist));

    }

    public static void StringTest() {
        String str1 = "Test";
        String str2 = ",+Java";

        str2 = str1.concat(str2);

        String[] list = str2.split(",");
        System.out.println(Arrays.toString(list));

        String str = "value = %d, Name = %s";
        str = String.format(str, 199,"hahah");

        System.out.println(str);
    }
}