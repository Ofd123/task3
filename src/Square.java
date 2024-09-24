public class Square extends Shape
{
    double rib;

    public Square(double rib)
    {
        this.rib = rib;
    }
    @Override
    public void calculateArea()
    {
        System.out.println("the area is: "+this.rib*this.rib);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("the perimeter is:"+this.rib*4);
    }
}
