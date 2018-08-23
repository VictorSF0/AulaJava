
import java.util.Scanner;

public class Receber {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a  = tcl.nextInt();
        int b  = tcl.nextInt();
        
        if(a > b){
            System.out.println(a + " é o maior");
        }else if(a < b){
            System.out.println(b + " é o maior");
        }else{
            System.out.println("São iguais");
        }
    }
}
