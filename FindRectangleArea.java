/*Write a program in Java to define a class Rectangle having data member: 
length and breadth; to calculate the area and perimeter of the rectangle. Use 
member functions to read, calculate and display.
*/
class FindRectangleArea
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle(10, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
    
    }
}

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}