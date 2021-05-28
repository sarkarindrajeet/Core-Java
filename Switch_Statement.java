


import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
       Scanner st=new Scanner(System.in);
       int a,b;
        System.out.print("Enter two Operand = ");
        a=st.nextInt();
        b=st.nextInt();
       char ch;
        System.out.println("+,-,*,/");
        ch=st.next().charAt(0);
       switch(ch){
           case '+':
               System.out.println(a+ "+" +b+ "=" +(a+b));
               break;
           case '-':
               System.out.println(a+ "-" +b+ "=" +(a-b));
               break;
               
           case '*':
               System.out.println(a+ "*" +b+ "=" +(a*b));
               break;
               
           case '/':
               System.out.println(a+ "/" +b+ "=" +(a/b));
               break;
           default:
               System.out.println("Error operator");
               
       }
        
    }
}
