



//Write a program to for blood donate
import java.util.Scanner;
public class Nested_if_statement {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        
        int age=st.nextInt();
        int wieght=st.nextInt();
        
        if(age>=18){
            if(wieght > 50){
                System.out.println("You are eligible for donate your blood");
            }
            else{
                System.out.println("You are not eligible ");
            }
              }
        else{
            System.out.println("Age must be greater than 18");
        }
    }
}
