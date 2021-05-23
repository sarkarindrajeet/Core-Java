
/* DataTypes:- 

 1.Primitive datatypes:-
boolean
int 
char 
double 
long 
float
short
byte

2. Non-Primitive datatypes:-
String 
Array


*/
public class Data_Types {
    public static void main(String[] args) {
        
    // How to declare primitive datatypes 
    boolean a=true;  // this datatype raise two condition . value true or false.
    System.out.println(a);
    
    char c='c'; //That is only hold the single letter.
        System.out.println(c);
        
    int i=100; // it is hold integer value.
        System.out.println(i);
    
    double d=23.44556; // that is hold large floating value     
          System.out.println(d);
          
    long l=12334333; // it is hold long integer number.
        System.out.println(l);
        
    float f= 2.34f; // that is hold float value one more thing you will define the value atfer the value you also put f.
        System.out.println(f);
        
    short s=12; // it is also hold integer number but short number.
        System.out.println(s);
        
    byte b=1; // that is hold small unit . it means that is store 1 bit data .
        System.out.println(b);
        
    // How to declare non-primitive datatypes
        
        String st="This is a string value"; // that is hold string value 
        System.out.println(st);
        
        // Two types of Array 
       //  1. 1d array .
      //   2. 2d array .
        
        int arr[]={1,2,3,4};
        for(int p=0; p<arr.length;p++){
            System.out.print(arr[p]);
        }
         System.out.println();
        //2d.array
        
        int x [][]={{2,3},{3,4}};
        for(int h=0;h<x.length;h++){
            for(int j=0;j<x.length;j++){
                System.out.print(x[h][j]);
                System.out.print(" ");
               
            }
            System.out.println(); 
        }
         
        
    
    
    }
}
