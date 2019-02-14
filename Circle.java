public class Circle {
        //atributos
        double areas;
        double length;
        double perimeter;
        double width;

        //metodos
        public void calcArea(){
            area= Math.PI * Math.pow ((width / 2),2); 


        }   

        public void calcPerimeter(){
            perimeter= 2 * Math.PI * (width /2);


        }
        public double getArea(){
                return area;
        }
            public double getPerimeter(){
                return perimeter;
            }
        public void setLength(double length){

        }
            // Circle circle1;
            //circle1 =new Circle();
        public static void main(String[] args) {
            Circle circle1 =new Circle();
            Circle circle2 =new Circle();
            Circle circle3 =new Circle();

            Circle1.width = 5.2d;
            Circle2.width = 10d;
            Circle3.width = 20d;


            circle1.calcArea();
            circle2.calcArea();
            circle3.calcArea();

            system.aut.println("El area de circle1 es:"+ circle1.getArea());
            system.aut.println("El area de circle2 es:"+ circle1.getArea());
            system.aut.println("El area de circle3 es:"+ circle1.getArea());


            circle1.calcPerimeter();
            circle2.calcPerimeter();
            circle3.calcPerimeter();

            system.aut.println("El perimeter de circle1 es:"+ circle1.getPerimeter());
            system.aut.println("El perimeter de circle2 es:"+ circle1.getPerimeter());
            system.aut.println("El perimeter de circle3 es:"+ circle1.getPerimeter());






        }

}