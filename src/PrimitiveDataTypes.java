/**
 *boolean
 *
 * byte
 * short
 * int - Integer
 * long
 * float
 * double - Double
 *
 * char
 * string - String
 */
public class PrimitiveDataTypes {
    public void explainInteger(){
        int a = 2;
        int b = 5;
        a = 10;
        System.out.println(a);
    }
    public void explainDouble(){
        double a = 7.0;
        double b = 2.0;
        System.out.println(a / b);
    }
    public void castNumber(){
        double a = 3.5;
        int b = (int)a;
        System.out.println(b);
    }
    public void explainString() {
        String text1 = "hello";
        String text2 = "Alvin";
        System.out.println(text1 + text2);
    }
    public void parseData(){
        String numberText = "5";
        int number = 2;
        System.out.println(Integer.valueOf(numberText) + number);
        System.out.println(number + " " + "hi");
    }
}
