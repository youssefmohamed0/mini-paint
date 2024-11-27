package lab6;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

public abstract class ShapeTemplate implements Shape{
    private Color color;
    private Color FillColor;
    private Point position;
    private Map<String, Double> properties;

    public ShapeTemplate(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        this.color = color;
        this.FillColor = FillColor;
        this.position = position;
        this.properties = properties;
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

    @Override
    public String getLineRepresentation() {
        return color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "," + FillColor.getRed() + "," + FillColor.getGreen() + "," + FillColor.getBlue() + "," + position.x + "," + position.y + "," + properties.values().toString().replaceAll("[\\[\\]]", "") + "\n";
    }
    
}
