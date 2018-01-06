package CalculateAreaAndParimeter;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author sahni
 */
public class RightTriangle extends Shape{
    /** Represents a Right Triangle.
     * Extends Shape.
     */ 
    //Data Fields
    /** The base of the Right Triangle. */
    private double base = 0;
    /** The height of the Right Triangle. */
    private double height = 0;
        
    // Constructors
    public RightTriangle() 
    {
        super("Right Triangle");
    }
        
    /** Constructs a Right Triangle of the specified size.
     * @param base the width
     * @param height the height
     */
    public RightTriangle(double base, double height) 
    {
        super("Right Triangle");
        this.base = base;
        this.height = height;
    }
    // Methods
    /** Get the base.
     * @return the base
     */
    public double getBase()
    {
        return base;
    }
    /** Get the height.
     * @return the height
     */
    public double getHeight()
    {
        return height;
    }
    /** Compute the area.
     * @return the area of the Right Triangle
     */
    @Override
    public double computeArea()
    {
        return (base * height) / 2;
    }
    /** Compute the perimeter.
     * @return the perimeter of the Right Triangle
     */
    @Override
    public double computePerimeter()
    {
        return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    /** read the attributes of the Right Triangle. */
    @Override
    public void readShapeData()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the Right Triangle");
        base = in.nextDouble();
        System.out.println("Enter the height of the Right Triangle");
        height = in.nextDouble();
    }
    /** Create a string representation of the Right Triangle.
     * @return A string representation of the Right Triangle.
     */
    @Override
    public String toString()
    {
        return super.toString() + ": width is " + base
                +", height is " + height;
    }
}
