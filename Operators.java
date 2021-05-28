
import java.util.Scanner;


/* Operators 
1.Arithmtic Operators.
2.Bitwise Operators.
3.Assignment Operators.
4.Comparison Operators.
5.Logical Operators.

*/
 
//Arithmetic Operators(+,-,*,/,%,++,--)
public class Operators {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
      
       System.out.println("Enter operands : ");
        
        System.out.print("a = ");
       int a=reader.nextInt();
       System.out.print("b = ");
       int b=reader.nextInt();
       
        int sum=a+b;
        System.out.println("a + b = "+sum);
       int sub=a-b;
        System.out.println("a - b = "+sub);
       int mul=a*b;
        System.out.println("a * b = "+mul);
        float div=a/b;
        System.out.println("a / b = "+div);
        int remainder=a%b;
        System.out.println("a % b = "+remainder);
        System.out.print("C = ");
        int c=reader.nextInt();
        c++;
        System.out.println("c++ = "+c);
        ++c;
        System.out.println("++c = "+c);
        System.out.print("d = ");
        int d=reader.nextInt();
        d--;
        System.out.println("d-- = "+d);
        --d;
        System.out.println("--d = "+d);
        
        
    }
}
