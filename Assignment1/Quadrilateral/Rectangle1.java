package Assignment1;
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
