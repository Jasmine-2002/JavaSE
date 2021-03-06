import java.util.Scanner;

class QuadraticEquation{
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return (b*b-4*a*c);
    }
    public double getRoot1() {
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2() {
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
}

public class Quiz2_2{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter:a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double k=equation.getDiscriminant();
        if(k<0) {
            System.out.println("The equation has no roots");
        }else if(k==0) {
            System.out.println("The root is " + equation.getRoot1());
        }else if(k>0){
            System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
        }
        sc.close();
    }

}
