public class Circle extends Shape
{
    double r;
    double pi = Math.PI;

    public Circle(double r)
    {
        this.r = r;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("the area is: "+r*r*pi);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("the perimeter is: "+2*pi*r);
    }
}
