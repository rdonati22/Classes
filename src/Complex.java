public class Complex {

    private double a;
    private double b;

    public Complex (double first){
        this (first, 0.0);
    }

    public Complex (double first, double second){
         a = first;
         b = second;
    }

    public String toString (){
        return (a + " + " + b + "i");
    }

    public double abs (){
        return (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }

    public Complex add (Complex other){
        double real = this.a + other.a;
        double imaginary = this.b + other.b;
        return new Complex (real, imaginary);
    }

    public Complex add (double x){
        double y = x + a;
        return new Complex (y,b);
    }

    public Complex multiply (Complex other){
        double t1 = this.a * other.a;
        double t2 = this.b * other.b;
        double t3 = this.a * other.b;
        double t4 = this.b * other.a;
        return new Complex (t1-t2, t3+t4);
    }

    public Complex multiply (double x){
        double y = x*a;
        return new Complex (y,b);
    }

    public static void main(String[] args){
        Complex one = new Complex (5.0, -12.0);
        Complex two = new Complex (-2.0, 1.0);
        Complex three = new Complex (5.0);
        Complex four = new Complex (0.0, -3.0);

        System.out.println(one.abs());
        System.out.println(two);
        System.out.println(two.add(three));
        System.out.println(four.add(one));
        System.out.println(two.add(6.2));
        System.out.println(two.multiply(one));
        System.out.println(four.multiply(three));
        System.out.println(two.multiply(3));
    }
}