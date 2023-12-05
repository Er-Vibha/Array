//Sum of the array elements and finding the element in array
public class SumArrayEle {
    public static void main(String[] args) {
        float []ar=new float[5];
        float a=30.6f;
        ar[0]=10.4f;
        ar[1]=20.5f;
        ar[2]=30.6f;
        ar[3]=40.7f;
        ar[4]=50.8f;
        float sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            if (ar[i]==a){
                System.out.println("found the number:"+ar[i]);
            }
        }
        System.out.println("Sum of numbers are:"+sum);
    }
}
