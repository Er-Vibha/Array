import java.util.Scanner;
class ArrayTest{
    public static void main(String[] args) {
        int []a;
        a=new int[6];
        for(int i=0;i<a.length;i++){
            Scanner sc=new Scanner(System.in);
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}