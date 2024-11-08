package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.text.Position;

public class Square implements Shape {
//    private Double sideLength;
    private Color color;
    private Color FillColor;
    private Point position;
    private Map<String, Double> properties;

    public Square(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        this.color = color;
        this.FillColor = FillColor;
        this.position = position;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public void draw(Graphics canvas) {
        int side = properties.get("sideLength").intValue();
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, side, side);
        canvas.setColor(FillColor);
        canvas.fillRect(position.x+1, position.y+1, side-1, side-1);
    }
    
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getFillColor() {
        return FillColor;
    }

    @Override
    public void setFillColor(Color FillColor) {
        this.FillColor = FillColor;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override

    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }
    
}
