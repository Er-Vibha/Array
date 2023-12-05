class ArrayTest1{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("The length of the array is:"+arr.length);
        //Using for loop
        //for (int i=0;i<arr.length;i++){
        //System.out.println(arr[i]);
        // }
        //Using for each
        for (int a:arr){
            System.out.println(a);
        }
    }
}