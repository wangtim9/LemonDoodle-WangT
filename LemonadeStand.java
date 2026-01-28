import doodlepad.*;
import java.util.ArrayList;

public class LemonadeStand {
    public static void main(String[] args) {
    
        Rectangle r1 = new Rectangle(800, 720, 300, 160);
        Rectangle r2 = new Rectangle(810, 520, 30, 200);
        Rectangle r3 = new Rectangle(1060, 520, 30, 200);
        Rectangle r4 = new Rectangle(785, 710, 330, 10);
        Line l1 = new Line(770, 520, 1130, 520);
        Line l2 = new Line(800, 440, 1100, 440);
        Line l3 = new Line(800, 440, 770, 520);
        Line l4 = new Line(1100, 440, 1130, 520);
        //Line l5 = new Line(785, 710, 805, 700);
        //Line l6 = new Line(1115, 710, 1095, 700);
        ArrayList<Point> points = new ArrayList<>();
        points.add( new Point( 805, 700) );
        points.add( new Point( 1095,  700) );
        points.add( new Point( 1115, 710) );
        points.add( new Point( 785, 710) );
        points.add( new Point( 805, 700) );
        ArrayList<Point> points2 = new ArrayList<>();
        points2.add( new Point( 820, 630) );
        points2.add( new Point( 830, 645) );
        points2.add( new Point( 815, 695) );
        points2.add( new Point( 830, 705) );
        points2.add( new Point( 850, 705) );
        points2.add( new Point( 865, 695) );
        points2.add( new Point( 850, 645) );
        points2.add( new Point( 860, 630) );
        points2.add( new Point( 820, 630) );
        ArrayList<Point> points3 = new ArrayList<>();
        points3.add( new Point( 829.8, 650) );
        points3.add( new Point( 815, 695) );
        points3.add( new Point( 830, 705) );
        points3.add( new Point( 850, 705) );
        points3.add( new Point( 865, 695) );
        points3.add( new Point( 851, 650) );
        
        // Pass Point List to Polygon constructor
        
        Polygon p1 = new Polygon(points); //top of table
        Polygon p2 = new Polygon(points2); //pitcher
        Polygon p3 = new Polygon(points3); //lemonade in pitcher
        p3.setFillColor(255,255,0);
        for (int i = 5; i < 14; i++){
			Rectangle ri = new Rectangle(((i-5)*40 + 770), 520, 40, 60);
			if (i%2 == 1) {
				ri.setFillColor(255,223,0);
			}
			else {
				ri.setFillColor(255,255,224);
			}
		}
		for (int n = 5; n < 14; n++) {
			Arc a1 = new Arc(((n-5)*40 + 770), 560, 40, 40, 180, 180);
			Line ln = new Line(((n-5)*40 + 771), 580, ((n-5)*40 + 809), 580);
        
			if (n%2 == 1) {
				a1.setFillColor(255,223,0);
				ln.setStrokeColor(255,223,0);
			}
			else {
				a1.setFillColor(255,255,224);
				ln.setStrokeColor(255,255,224);
			}
		}
		//cups made to look stacked on each other
		Path cup = new Path();//must have doubles
		cup.moveTo(1020.0, 680.0);
		cup.lineTo(1025.0, 705.0);
		cup.quadTo(1030.0, 710.0, 1035, 705);
		cup.lineTo(1040.0, 680.0);
		cup.quadTo(1030.0, 685.0, 1020.0, 680.0);
		Path cup2 = new Path();
		cup2.moveTo(1022.0, 682.0);
		cup2.lineTo(1020.0, 670.0);
		cup2.quadTo(1030.0, 675.0, 1040.0, 670.0);
		cup2.lineTo(1038.0, 682.0);
		Path cup3 = new Path();
		cup3.moveTo(1022.0, 672.0);
		cup3.lineTo(1020.0, 660.0);
		cup3.quadTo(1030.0, 665.0, 1040.0, 660.0);
		cup3.lineTo(1038.0, 672.0);
		Oval ocup = new Oval(1020.0, 660.0, 20.0, 2.0);
    }
}
