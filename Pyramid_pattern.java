public class Pyramid_pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); //Scanner class in java
System.out.print("Enter the rows you want:");
int rows=sc.nextInt();
System.out.println("");
for (int i=1; i<=rows; i++){//outer forloop
  for (int j=1; j<=(rows-i)*2; j++){
  System.out.print(" ");//create initial space for pyramid shape
  }
for (int k=i; k>=1; k--){//inner for loops
  System.out.print(" "+k);//create left half            
}                                        
for (int l=2; l<=i; l++){
  System.out.print(" "+l);    //create right half
}//end outer for loop                            
System.out.println();
}                                                 
}
}
