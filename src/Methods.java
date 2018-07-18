/**
 * function & method
 * why?
 * parameter
 * return value
 */
public class Methods {
    // parameter x / return value x
    public void testMethodOne(){
        System.out.println("method one");
    }
    // parameter o / return value x
    public void testMethodTwo(String str){
        System.out.println("method " + str);
    }
    // parameter x / return value o
    public String testMethodThree(){
        return "method three";
    }
    // parameter o / return value o
    public int testMethodFour(int a, int b){
        return a + b;
    }
}
