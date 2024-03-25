import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
    //Fill the code here
        System.out.println("Enter the size of first array");
        int f = sc.nextInt();
        if(f<=0){
            System.out.println(f+" is an invalid array size");
            return;
        }
        int [] first = new int[f];
        System.out.println("Enter the array elements");
        for(int i= 0;i < f;i++){
            first[i] = sc.nextInt();
            if(first[i] < 0){
                System.out.println(first[i]+" is an invalid input");
                return;
            }
        }
        System.out.println("Enter the size of second array");
        int s = sc.nextInt();
        if(s<=0){
            System.out.println(s+" is an invalid array size");
            return;
        }else if(s != f){
            System.out.println("Both array size is different");
            return;
        }
        int [] sec = new int[s];
        System.out.println("Enter the array elements");
        for(int i= 0;i < s;i++){
            sec[i] = sc.nextInt();
            if(sec[i] < 0){
                System.out.println(sec[i]+" is an invalid input");
                return;
            }
        }
        int [] res = new int[s];
        for(int i = 0; i< s;i++){
            res[i] = first[i]+sec[i];
        }
        int ans = 0;
        for(int ele : res){
            ans += ele%10;
        }
        
        if(isPrime(ans)){
            System.out.println(ans+" is a prime number");
        }else{
            System.out.println(ans+" is not a prime number");
        }
        
	}
    
    public static boolean isPrime(int a){
        for(int i = 2;i <= Math.sqrt(a);i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }

}