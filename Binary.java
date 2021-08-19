import java.util.*;
class Main
{
    public static void binarySearch(int arr[],int first,int last,int key)
    {
        int mid=(first+last)/2;   //4
        while(first<=last)       //1<=7
        {
            if(arr[mid]<key)     //4<6
            {
                first=mid+1;    //first=4+1=5
            }
            else if(arr[mid]==key)//
            {
                System.out.println("Element found at index:"+ mid);
                break;
            }
            else
            {
                last=mid-1;//last=3
            }
            mid=(first+last)/2;
        }
        if(first>last)  //5>3
        {
            System.out.println("Element is not found");
        }
    }

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,key,arr[];
    System.out.println("Enter number of elements");
    n=sc.nextInt();
    arr=new int[n];
    System.out.println("Enter "+n+" elements");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    System.out.println("Enter number of elements to search");
    key=sc.nextInt();
    int last=n-1;
    binarySearch(arr,0,last,key);
}
}
