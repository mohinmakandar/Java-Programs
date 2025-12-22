class RelationalOperators {
    public static void main(String args[]){
        int num1=10;
        int num2=6;
        int num3=10;
        int num4=100;
       boolean result;
       /*Greater than */
       result = num1>num2;
       System.out.println(result);
       /*Less than */
       result = num2<num3;
       System.out.println(result);
       /*Greater than equal to */
       result = num1>=0;
       System.out.println(result);
       /*Less than equal to */
       result = num4<=100;
       System.out.println(result);
       /* Equal to */
       result = num1==num3;
       System.out.println(result);
       /*Not equal to*/
       result = num1!=num2;
       System.out.println(result);
       /*Not */
       result = !(num1<num2);
       System.out.println(result);
    }
}