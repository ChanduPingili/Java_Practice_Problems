import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            if(valid(input) == true){
                System.out.println("true");
            }else
                System.out.println("false");
            
		}
		
	}
    
    public static boolean valid(String input){
        Stack<Character> stk = new Stack<>();
        int len = input.length();
        if(len % 2 != 0)
            return false;
        for(int i = 0; i < input.length();i++){
            char x = input.charAt(i);
            if(x == '}' ){
                if(stk.size() == 0)
                    return false;
                char y = stk.pop();
                if(y != '{')
                    return false;
            }
            else if(x == ']' ){
                if(stk.size() == 0)
                    return false;
                char y = stk.pop();
                if(y != '[')
                    return false;
            }
            else if(x == ')' ){
                if(stk.size() == 0)
                    return false;
                char y = stk.pop();
                if(y != '(')
                    return false;
            }else{
                stk.push(x);
            }
        }
        if(stk.size() != 0)
            return false;
        return true;
    }
}


