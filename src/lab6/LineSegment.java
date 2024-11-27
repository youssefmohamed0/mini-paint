package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.text.Position;

public class LineSegment extends ShapeTemplate {

    public LineSegment(Color color, Color FillColor, Point position, Map<String, Double> properties) {
        super(color, FillColor, position, properties);
    }

    @Override
    public String toString() {
        return "lineSegment";
    }
    @Override
    public String getLineRepresentation() {
        return toString() + "," + super.getLineRepresentation();
    }

    @Override
    public void draw(Graphics canvas) {
        int x2 = getProperties().get("x2").intValue();
        int y2 = getProperties().get("y2").intValue();
        canvas.setColor(getColor());
        canvas.drawLine(getPosition().x, getPosition().y, x2, y2);
    }
    
}
