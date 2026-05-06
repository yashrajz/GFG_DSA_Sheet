import java.util.*;

public class StackInfixEvaluation {
    public static int infix(String str) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){  //if str[i] == number, push it in the val stack;
                val.push(ch - '0');
            }
            //if ch is an operator, then
            // if op stack is empty or ch is '(', push ch in op stack; 
            // if op.peek() is '(', push ch in op stack;
            else if(op.isEmpty() || ch == '(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch == ')'){   //if ch is ')', then finish work till '(' is found in op stack
                while(op.peek() != '('){
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();   //remove operator after doing work
                }
                op.pop();   //remove '(' from op stack
            }
            else{   //ch not a number and op stack is not empty
                
                if(ch == '+' || ch == '-'){
                    //Finish earlier work before pushing ch in op stack

                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();   //remove operator after doing work

                    op.push(ch);   //push ch in op stack
                    
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){

                        int v2 = val.pop();
                        int v1 = val.pop();

                        if(op.peek() == '*') val.push(v1 * v2);
                        if(op.peek() == '/') val.push(v1 / v2);
                        op.pop();   //remove operator after doing work

                        op.push(ch);   //push ch in op stack
                    }
                    else{
                        op.push(ch);   //push ch in op stack
                    }
                }

            }
        }

        while(val.size() > 1){
            int v2 = val.pop();
            int v1 = val.pop();

            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);
            op.pop();   //remove operator after doing work
        }

        return val.peek();
        


    }
    public static void main(String[] args) {
        String str = "2*(3+4*5)";
        System.out.println(infix(str));
    }
}
