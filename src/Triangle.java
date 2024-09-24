public class Triangle extends Shape
{
    double a,b,c,height;

    public Triangle(double a, double b, double c, double height)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("the area is: "+this.a*this.height);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("the perimeter is: "+this.a+this.b+this.c);
    }
}
