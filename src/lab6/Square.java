package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.text.Position;

public class Square extends ShapeTemplate{
//    private Double sideLength;
//    private Color color;
//    private Color FillColor;
//    private Point position;
//    private Map<String, Double> properties;

    public Square(Color color, Color FillColor, Point position, Map<String, Double> properties) {
//        this.color = color;
//        this.FillColor = FillColor;
//        this.position = position;
//        this.properties = properties;
        super(color, FillColor, position, properties);    
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public void draw(Graphics canvas) {
        int side = getProperties().get("sideLength").intValue();
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, side, side);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x+1, getPosition().y+1, side-1, side-1);
    }    
}
