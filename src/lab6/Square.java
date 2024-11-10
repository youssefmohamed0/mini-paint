package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Square extends ShapeTemplate{

    public Square(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        super(color, FillColor, position, properties);    
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public void draw(Graphics canvas) {
        int side = getProperties().get("sideLength").intValue();
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x, getPosition().y, side, side);
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, side, side);
    }    
}
