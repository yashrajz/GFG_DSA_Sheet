
public class StackImplementationUsingArray {

    public static class Stack{
        int[] arr;
        int n;
        int top;

        //Constructor
        Stack(int size){
            n = size;
            arr = new int[n];
            top = -1;
        }

        //push operation;
        public void push(int x){
            if(top == n - 1){
                System.out.println("Stack Overflow");
            }
            else{
                arr[++top] = x;
                // top++;
            }
        }

        //pop operation
        public int pop(){
            if(top == -1){
                System.out.println("Stack Underflow");
                return -1;
            }

            return arr[top--];
        }

        //peek operation
        public int peek(){
            if(top == -1){
                System.out.println("Stack is Empty!");
                return -1;
            }

            return arr[top];
        }

        //isEmpty operation
        boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }

        //isFull operation
        public boolean isFull(){
            if(top == n - 1){
                return true;
            }
            return false;
        }

        // display operation
        public void display(){
            if(top == -1){
                System.out.println("Stack is Empty.");
            }

            for(int i = top; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(5);
        st.push(6);
        st.push(3);
        st.display();
        st.push(13);
        st.push(7);
        st.display();

        st.push(3);





    }


}
