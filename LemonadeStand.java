import doodlepad.*;

public class LemonadeStand {
    public static void main(String[] args) {
    
        Rectangle r1 = new Rectangle(800, 720, 300, 160);
        Rectangle r2 = new Rectangle(800, 520, 40, 200);
        Rectangle r3 = new Rectangle(1060, 520, 40, 200);
        Line l1 = new Line(770, 520, 1130, 520);
        Line l2 = new Line(800, 440, 1100, 440);
        Line l3 = new Line(800, 440, 770, 520);
        Line l4 = new Line(1100, 440, 1130, 520);
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
			Line ln = new Line(((n-5)*40 + 771), 580, ((n-5)*40 + 819), 580);
        
			if (n%2 == 1) {
				a1.setFillColor(255,223,0);
				ln.setStrokeColor(255,223,0);
			}
			else {
				a1.setFillColor(255,255,224);
				ln.setStrokeColor(255,255,224);
			}
		}
    }
}
