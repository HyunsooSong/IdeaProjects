class Calulator1{
    double a;
    double b;
    public Calulator1(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double sum(){
        return a + b;
    }
    public double substract(){
        return a - b;
    }
    public double multuply(){
        return a * b;
    }
    public double divide(){
        return a / b;
    }
}
public class Calculator {
    public static void main (String[] args){
        Calulator1 calulator1 = new Calulator1(87.2,23.5);
        System.out.println(calulator1.sum());
        System.out.println(calulator1.substract());
        System.out.println(calulator1.multuply());
        System.out.println(calulator1.divide());
    }
}
