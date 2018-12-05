import java.awt.*;

public class RandomShape {
    private int sides;
    private double area;
    private double width;
    private double height;
    private Shape basicShape;

    public RandomShape(int s, double w, double h){
        this.sides = s;
        this.width = w;
        this.height = h;

        if(s==2){
            //shape is an ellipse
            this.area = (Math.PI/4*width*height);
            //this.basicShape = new Circle();
            }
        }else if(s==3){
            //shape is a triangle
        }

    }


}
