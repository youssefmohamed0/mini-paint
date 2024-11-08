package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.text.Position;

public class Square implements Shape {
    private String name;
    private Color color;
    private Color FillColor;
    private Point position;
    private Map<String, Double> properties;

    public Square(String name, Color color, Color FillColor, Point position, Map<String, Double> properties) {
        this.name = name;
        this.color = color;
        this.FillColor = FillColor;
        this.position = position;
        this.properties = properties;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        int side = properties.get("sideLength").intValue();
        canvas.drawRect(position.x, position.y, side, side);
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
