
// Write a program to fine numbers are postive or negative

import java.util.Scanner;
public class If_else_If {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int x=st.nextInt();
        
        if(x > 0){
            System.out.println("Positive number ="+x);
        }
        else if(x < 0){
            System.out.println("Negative number ="+x);
         }
        
        else{
            System.out.println("Number is Zero ="+x);
        }
    }
    
}
