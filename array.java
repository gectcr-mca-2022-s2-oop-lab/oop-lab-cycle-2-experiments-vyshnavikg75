import java.util.Scanner;
public class array {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of string array");
int n=sc.nextInt();
String[] starray = new String[n];
int i,k;
System.out.println("enter"+n+"strings to string array");
for(i=0;i<n;i++) {
starray[i]=sc.next();
}
System.out.print("Array is :\n{");
for(i=0;i<n;i++) {
System.out.print(starray[i]+" ");
}
System.out.print("} \n");
//bubble sort
String temp;
for(i=0;i<n-1;i++) {
for(k=0;k<(n-1-i);k++) {
if(starray[k].compareTo(starray[k+1])>0) {
temp=starray[k];
starray[k]=starray[k+1];
starray[k+1]=temp;
}
}
}
System.out.print("sorted array is :\n{");
for(i=0;i<n;i++) {
System.out.print(starray[i]+" ");
}
System.out.print("} \n");
}
}
