class Types {
    public static void main(String args[]){
        /*Example 1 - Integer to byte*/

        byte b = 127;
        int a = b; //Type conversion of  byte to integer
        int k = 259;

        byte c = (byte)k; //Type casting for biggers types casted to smaller types. Gives same value when in range. Else gives k%range of byte
        
        float fl = 5.6f;
        int in = (int) fl;

        System.out.println("Initial values: "+b+" "+k+" "+fl);

        System.out.println("Type conversion value: "+a); //outputs 127

        System.out.println("Type casted value: "+c); //outputs 3 due to modular operation

        
        System.out.println("Type casted Float to integer: "+in); //Type casted float to integer.

        /*Type Promoting */

        byte v = 10;
        byte w = 30;

        int result = v * w;
        System.out.println("Type Promoted result: "+result); //Byte type promoted to Integer type
    }
}