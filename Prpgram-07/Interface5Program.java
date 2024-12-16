program 1*******

interface MyInterface {
public void method1();
public void method2();
}

class Demo implements MyInterface{
public void method1(){
System.out.println("implementation of method1");
}
public void method2(){
System.out.println("implementation of method2");
}

public static void main(String arg[])
{
MyInterface obj =  new Demo();
obj.method1();
}
}


program 2****

interface Animal{
void Sound();
void eat();
}

class Dog implements Animal{
public void Sound(){
System.out.println("Dog barks");
}
public void eat(){
System.out.println("Dog eats bones");
}
}

public class Maini{
public static void main(String[] args){
Animal myDog = new Dog();
myDog.Sound();
myDog.eat();
}
}

program 3******

interface Vehicle{
void start();

}
interface Car extends Vehicle{
void drive();

}

class Sedan implements Car{
public void start(){
System.out.println("Sedan is starting...");
}
public void drive(){
System.out.println("Sedan is driving...");
}
}

public class Mainv{
public static void main(String[] args){
Car mycar = new Sedan();
mycar.start();
mycar.drive();
}
}

 program 4 ********

interface Printable{
void print();
}

interface showable{
void show();
}

class Document implements Printable,showable{
public void print(){
System.out.println("Printing document");
}
public void show (){
System.out.println("Showing Document preview");
}
}

public class Mainp{

public static void main (String[] args){
Document doc = new Document();
doc.print();
doc.show();
}
}


program 5 *******


interface Polygon {
public void getPerimeter();
public void getArea();
}


class Rectangle implements Polygon {
 double length;
 double width;

public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

public void getArea() {
System.out.println("Area of Rectangle:"+ (length * width));
}

public void getPerimeter() {
System.out.println("Perimeter of Rectangle:"+ 2*(length * width));
}
}

class Circle implements Polygon {
double radius;
public Circle(double radius) {
this.radius = radius;
}

public void getArea() {
System.out.println("Area of circle:"+ (Math.PI * radius * radius));
}

public void getPerimeter() {
System.out.println("Area of circle:"+ (2 * Math.PI * radius));
}
}


class program5 {
public static void main(String[] args){
Polygon r = new Rectangle(10,20);
r.getArea();
r.getPerimeter();
Polygon c = new Circle(10);
c.getArea();
c.getPerimeter();
}
}
