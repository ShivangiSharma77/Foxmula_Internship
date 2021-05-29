package src.com.foxmula.DailyTask1;
class Calling_Quadilateral
{
    public static void main(String args[])
    {
                Rectangle1 r = new Rectangle1(50,50,250,50,250,150,50,150);
		Square1 s = new Square1(0, 0, 70, 0, 70 ,70, 0, 70);
		Parallelogram1 p = new Parallelogram1(50,50,250,50,150,150,0,150,180);
		Trapezoid1 t = new Trapezoid1(50,50,250,50,150,150,0,150,180);
		System.out.println("The area of Square is " + s.area());
		System.out.println("The area of Rectange is : " + r.area());
		System.out.println("The area of Parallelogram is " + p.area());
		System.out.println("The area of Trapezoid is " + t.area());
    }
}
