package Assignment1;
class Calling_Quadilateral
{
    public static void main(String args[])
    {
  
		Rectangle1 r = new Rectangle1(0, 0, 4, 0, 4, 2, 0, 2);
		Square1 s = new Square1(0, 0, 2, 0, 2 ,2, 0, 2);
		Parallelogram1 p = new Parallelogram1(0, 0, 2, 0, 3, 1, 1, 1, 7);
		Trapezoid1 t = new Trapezoid1(0, 0, 5, 0, 4, 4, 1, 4, 8);
		
		System.out.println("The area of Square is " + s.area());
		System.out.println("The area of Rectange is : " + r.area());
		System.out.println("The area of Parallelogram is " + p.area());
		System.out.println("The area of Trapezoid is " + t.area());
    }
}
