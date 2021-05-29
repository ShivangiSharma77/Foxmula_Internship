package src.com.foxmula.DailyTask1;
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
