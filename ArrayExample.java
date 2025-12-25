class ArrayExample{
    public static void main(String args[]){
        int a[] = new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=i;
            System.out.println(a[i]);
        }

        //Another way to declare array
        int arr[] = {10,20,9,45,50};
        arr[3] = 99;    
        System.out.println("New Array: \n");

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}