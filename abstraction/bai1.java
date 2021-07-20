package abstraction;

import java.util.Scanner;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

/**
 * bai1
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("giải pt : ax2 + bx + c = 0 ");
        System.out.print("Nhập a = ");
        int a = sc.nextInt();
        System.out.print("nhập b = ");
        int b = sc.nextInt();
        System.out.print("nhập c = ");
        int c = sc.nextInt();
        int delta = b*b -4*a*c;
        int x1;
        int x2;
        
        if (delta>0) {
            x1 = (int) (((-b)+Math.sqrt(delta)))/(2*a);
            x2 =(int) (((-b)-Math.sqrt(delta)))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }if (delta == 0) {
            x1 = (-b)/(2*a);
            x2 = x1;
            System.out.println("x1 = x2 = " + x2);
        } if (delta<0) {
            System.out.println("phương trình vô nghiệm");
        } 
        
        
        
    }
}