class MultiDimensionalArrays{
    public static void main(String args[]){
        int nums[][] = new int[3][4];
        
        System.out.println("Empty array with no values");
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Second array with values");

        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int) (Math.random() * 100); //Math.random gives double values and when multiplied by 100 we get values which are then casted to integer
                System.out.print(nums[i][j]+" "); //prints empty array
            }
             System.out.println();
        }

        System.out.println("Print using modern for loop");
        for(int arr[]: nums){
            for(int element: arr){
                 element = (int) (Math.random() * 100); //Math.random gives double values and when multiplied by 100 we get values which are then casted to integer
                System.out.print(element+" "); //prints empty array
            }
            System.out.println();
        }
    }
}