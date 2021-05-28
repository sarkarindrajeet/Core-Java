

//Bitwise Operator(&&,|,^,<<,>>)
public class Bitwise_Operators {
    public static void main(String[] args) {
        // 4 -> 100 bits
        // 5 -> 101
        //      100
        int a=4,b=5;
        int c=a & b; // & And operator
        System.out.println(c);
        
        // 10 -> 1010
        // 13 -> 1101
        //       1111
        int x=10,y=13;
        int z=x | y; // | OR operator
        System.out.println(z);
        
        // 10 -> 1010
        // 13 -> 1101
        //       0111
        int i=10,j=13;
        int k=i ^ j; // ^ XOR
        System.out.println(k);
        
        //Right shift 1101 -> 0110 -> 0011 -> 0001 -> 0000
        int s=10;
        int h= s >> 2;// >> Right Shift you can change position 1,2,3,4
        System.out.println(h);
        
        //Left shift 
        int g= s << 1;// >> Right Shift you can change position 1,2,3,4
        System.out.println(g);
        
        
    }
    
}
