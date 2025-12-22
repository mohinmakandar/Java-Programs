class Hello{
    public static void main(String args[]){
        int num1=10;
        int num2=20;

        //Integer numbers
        short num3 = 123;
        long num4 = 32322l;
        byte num5 = 2;
        int num6 = 23455;
        System.out.println("Integer numbers: ");
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        
        //Float
        float floatNum1 = 3.4f;
        double floatNum2 = 5.6;
        
        System.out.println("\nFloating point numbers");
        System.out.println(floatNum1);
        System.out.println(floatNum2);

        //Characters

        System.out.println("\nCharacters: ");
        char charVar='a';
        System.out.println(charVar);

        //Boolean
        System.out.println("\nBoolean");
        boolean boolVar = true;
        System.out.println(boolVar);

        //Addition of num1 and num2

        System.out.print("\nAddition: ");
        System.out.println(num1+num2);

        char charNum = '3';
        System.out.println(charNum+2);
    }
}