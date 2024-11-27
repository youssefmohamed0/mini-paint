package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Circle extends ShapeTemplate{

    public Circle(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        super(color, FillColor, position, properties);
    }

    @Override
    public String toString() {
        return "circle";
    }

    @Override
    public String getLineRepresentation() {
        return toString() + "," + super.getLineRepresentation();
    }
    
    @Override
    public void draw(Graphics canvas) {
        int radius = getProperties().get("radius").intValue();
        canvas.setColor(getFillColor()); 
        canvas.fillOval(getPosition().x, getPosition().y, radius, radius);
        canvas.setColor(getColor());
        canvas.drawOval(getPosition().x, getPosition().y, radius, radius);
    }
    
}
