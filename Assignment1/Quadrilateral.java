public class Quadilateral
{
    protected int x1,x2,x3,x4,y1,y2,y3,y4;
    protected void setCoordinate(int z1,int z2,int z3,int z4,int w1,int w2,int w3,int w4)
    {
        x1=z1;
        y1=z2;
        x2=z3;
        y2=z4;
        x3=w1;
        y3=w2;
        x4=w3;
        y4=w4;
    }
}
class Square1 extends Quadilateral
{
    Square1(int z1,int z2,int z3,int z4,int w1,int w2,int w3,int w4)
    {
        setCoordinate(z1,z2,z3,z4,w1,w2,w3,w4);
    }
    int area()
    {
        int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}
class Rectangle1 extends Quadilateral
{
    Rectangle1(int z1,int z2,int z3,int z4,int w1,int w2,int w3,int w4)
    {
    	setCoordinate(z1,z2,z3,z4,w1,w2,w3,w4);
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}
class Trapezoid1 extends Quadilateral
{
    private int ht;
    Trapezoid1(int z1,int z2,int z3,int z4,int w1,int w2,int w3,int w4, int ht)
    {
    	setCoordinate(z1,z2,z3,z4,w1,w2,w3,w4);
        this.ht=ht;
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return (int)((d1+d2)*ht)/2;
    }
}
class Parallelogram1 extends Quadilateral
{
    private int ht;
    Parallelogram1(int z1,int z2,int z3,int z4,int w1,int w2,int w3,int w4, int ht)
    {
    	setCoordinate(z1,z2,z3,z4,w1,w2,w3,w4);
        this.ht=ht;
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));

        return d1*ht;
    }
}
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
