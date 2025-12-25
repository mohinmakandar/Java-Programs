class Calculator{

    public int add(int n1, int n2){
        return n1+n2;
    }

    public double add(double n1, double n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
public class MethodOverloadingExample{
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(4.5,3.4));
    }
}