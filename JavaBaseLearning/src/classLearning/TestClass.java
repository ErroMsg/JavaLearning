package classLearning;

public class TestClass {
    private int m_val = 0;
    private String m_name = "null";

    public TestClass()
    {
    }

    public TestClass(String name,int val)
    {
        this.m_val = val;
        this.m_name = name;
    }

    public void printTestClass(){
        System.out.println("TestClass(name = "+m_val+","+m_name+")");
    }

    public int getM_val() {
        return m_val;
    }

    public void setM_val(int m_val) {
        this.m_val = m_val;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

}
