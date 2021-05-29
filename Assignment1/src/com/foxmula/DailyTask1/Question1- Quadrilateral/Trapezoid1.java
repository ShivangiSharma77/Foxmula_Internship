package src.com.foxmula.DailyTask1;
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
