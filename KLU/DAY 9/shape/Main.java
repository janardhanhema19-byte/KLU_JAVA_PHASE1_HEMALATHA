class Shape
{
    void area()
    {
        System.out.print("DISPLAY DIFFERENT SHAPES FORMULA");
    }
}
class Rectangle extends Shape 
{
    void area()
    {
        System.out.println("l*b");
    }
}class Circle extends Shape 
{
    void area()
    {
        System.out.print("22/7*a*a");
    }
}
class Main 
{
    public static void main(String[] args){
        Shape r = new Rectangle();
        Shape c = new Circle();
        r.area();
        r.area();
    }
}
    
    
    
    
    
    