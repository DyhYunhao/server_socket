package jisuanqi;

/**
 * Created by dyh on 17-3-2.
 */
interface Calc{
    public int add(int a,int b);
    public int sub(int a,int b);
}
public class NwServer implements Calc{
    public int add(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        return a - b;
    }
    public static void main(String[] ar0){
        Calc c = new NwServer();
        System.out.println("5 + 6 = " + c.add(5,6));
        System.out.println("5 - 6 = " + c.sub(5,6));
    }
}

