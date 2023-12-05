//Multidimensional Array
class Test{
  public static void main(String[] args) {
      int [][]ar=new int[2][3];
      ar[0][0]=11;
      ar[0][1]=12;
      ar[0][2]=13;
      ar[1][0]=21;
      ar[1][1]=22;
      ar[1][2]=23;
      for(int i=0;i<ar.length;i++){
          for (int j=0;j<=ar.length;j++){
              System.out.print(ar[i][j]);
              System.out.print(" ");
          }
          System.out.print("\n");
      }
  }}