package CalculateAreaAndParimeter;
import java.util.Scanner;
/**
 *
 * @author sahni
 */
public class Circle extends Shape{
    /** Represents a Circle.
     * Extends Shape.
     */ 
    //Data Fields
    /** The radius of the circle. */
    private double radius = 0;
    
    // Constructors
    public Circle() 
    {
        super("Circle");
    }
    
    /** Constructs a circle of the specified size.
     * @param radius the radius
     */
    public Circle(double radius) 
    {
        super("Circle");
        this.radius = radius;
    }
    
    // Methods
    /** Get the radius.
     * @return the radius
     */
    public double getRadius()
    {
        return radius;
    }
    /** Compute the area.
     * @return the area of the circle
     */
    @Override
    public double computeArea()
    {
        return 3.14 * radius * radius;
    }
    /** Compute the perimeter.
     * @return the Circumference of the circle
     */
    @Override
    public double computePerimeter()
    {
        return 2 * (3.14 * radius);
    }
    /** read the attributes of the circle. */
    @Override
    public void readShapeData()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        radius = in.nextDouble();
    }
    /** Create a string representation of the rectangle.
     * @return A string representation of the rectangle
     */
    @Override
    public String toString()
    {
        return super.toString() + ": radius is ";
    }
}
