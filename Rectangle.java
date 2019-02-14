public class circle{
    //atributos
    double area;
    double length;
    double perimeter;
    double width;

    //Metodos 
    public void calcArea(){
        area=Math.PI * Math.pow ((width / 2),2);

    }

    public void calcPerimeter(){
        perimeter= 2 * Math.PI * (width / 2);
    }

    public double getArea(){
    return area;    

    }

    public double getperimeter(){
    return perimeter;
    }

    public double setLength(double length){

    }
    public static void main(string[]args {
        //Circle circle1;
        //Circle=new Circle();
        Circle circle1= new Circle();
        Circle circle2= new Circle();
        Circle circle3= new Cicle();
        
        Circle1.width =5.2d;
        Circle2.width =10d;
        Circle3.widrh =20d;

        Circle1.calvArea();
        Circle2.calcArea();
        Circle3.calcArea();

        system.out.println("el area de circle1 es:"+ circle1.getArea());
        system.out.println("el area de circle2 es:"+ circle2.getArea());
        system.out.println("el area de circle3 es:"+ circle3.getArea());
    }

}