//Simple program to explain the concept of class.

class Text{
    public void displayText(String text){
        System.out.println(text);
    }
}

class Calculator{
    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}

public class ClassExample{
    public static void main(String args[]){
        Text textObj = new Text();
        Calculator calcObj = new Calculator();
        textObj.displayText("Mohin");
        calcObj.add(10,20);
    }
}