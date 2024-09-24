public class Rectangle extends Shape 
{
    double width;
    double length;

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public void calculateArea()
    {
        System.out.println("the area is: "+length*width);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("the perimeter is: "+length*2+width*2);
    }
}
