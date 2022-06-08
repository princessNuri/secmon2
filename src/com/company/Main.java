package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Krug",4);
        Triangle triangle =  new Triangle("Treugolnik",2,8,9);
        Rectangle rectangle = new Rectangle("Pryamougolnik",6,4);
        Square square = new Square("Kvadrat",7);
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Jane");
        //полиморфизм
        Drawable []drawables = {circle,square,rectangle,triangle,dog,cat};
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] instanceof Figure){
            System.out.println(((Figure)drawables[i]).getName()+
                    "\nPerimeter :"+((Figure)drawables[i]).calculatePerimeter());}
            if(drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }
        dog.callSound();


        /*System.out.println("---------------");
        for (Figure figure:figures) {
            System.out.println(figure.getName()+
                    "\nperimeter :"+figure.calculatePerimeter());

        }*/


        /*System.out.println("Circle name :"+circle.getName()+
                "\nCircle perimeter :"+circle.calculatePerimeter());
        System.out.println("Triangle name :"+triangle.getName()+
                "\nTriangle perimeter :"+triangle.calculatePerimeter());
        System.out.println("Rectangle name :"+rectangle.getName()+
                "\nRectangle perimeter :"+rectangle.calculatePerimeter());
        System.out.println("Square name :"+square.getName()+
                "\nSquare perimeter :"+square.calculatePerimeter());*/


    }
}
