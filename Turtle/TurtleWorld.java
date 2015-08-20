import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(100);
        turtle.penUp();
        turtle.turn(90);
        turtle.forward(100);
        turtle.turn(90);
        turtle.penDown();
        turtle.forward(100);
        turtle.penUp();
        turtle.setPenWidth(10);
        turtle.setPenColor(Color.GREEN);
        turtle.turn(25);
        turtle.forward(35);
        turtle.turn(20);
        turtle.penDown();
        turtle.forward(30);
        turtle.turn(45);
        turtle.forward(30);
        turtle.turn(45);
        turtle.forward(30);
        turtle.penUp();
    }
}
