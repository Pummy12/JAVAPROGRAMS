//SELECTION SORT (ASCENDING ORDER)
//*******PUMMYJHA*******
public class SelectionSort {
    public static void main(String args[])
    {
        int a[]={-2,0,1,3,4,7};
        int n = a.length;
        for(int i=0;i<n-1;i++){
          int minInd=i;
          for(int j=i;j<n;j++)
          {
              if(a[j]<a[minInd]){
              minInd=j;
          }
        }
        int temp = a[i];
        a[i] = a[minInd];
        a[minInd] = temp;
    }
    //for each loop 
  for(int e: a){
      System.out.print(e+" ");
         }
      }
}
