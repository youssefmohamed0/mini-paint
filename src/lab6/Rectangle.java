package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Rectangle extends ShapeTemplate {

    public Rectangle(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        super(color, FillColor, position, properties);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public void draw(Graphics canvas) {
        int length = getProperties().get("length").intValue();
        int width = getProperties().get("width").intValue();
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, length, width);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x+1, getPosition().y+1, length-1, width-1);
    }
    
}
