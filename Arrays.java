import java.io.*;
public class Arrays
{
    public static void main(String[] args) throws IOException
    { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        //Declaration:-

        int arr1[]=new int[5]; //Declaration 1
        int arr2[]; //Declaration 2
        System.out.println("Enter the no of elements in the second array");
        int n =Integer.parseInt(in.readLine());
        arr2= new int[n]; //Memory allocation of user defined size


        /*Traversing into an array*/

        //Taking input
        System.out.println("Enter the values one by one");
        for (int i=0;i<arr2.length;i++)
        {
            arr2[i]= Integer.parseInt(in.readLine());
        }
        //printing each element using for each loop
        for(int ch:arr2)
        {
            System.out.println(ch);
        }             
    }
}