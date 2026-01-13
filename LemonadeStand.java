import doodlepad.*;

public class LemonadeStand {
    public static void main(String[] args) {
    
        Rectangle r1 = new Rectangle(50, 160, 150, 80);
        Rectangle r2 = new Rectangle(50, 60, 20, 100);
        Rectangle r3 = new Rectangle(180, 60, 20, 100);
        Line l1 = new Line(35, 60, 215, 60);
        Line l2 = new Line(50, 20, 200, 20);
        Line l3 = new Line(50, 20, 35, 60);
        Line l4 = new Line(200, 20, 215, 60);
        for (int i = 5; i < 14; i++){
			Rectangle ri = new Rectangle(((i-5)*20 + 35), 60, 20, 30);
			if (i%2 == 1) {
				ri.setFillColor(255,223,0);
			}
		else {
			ri.setFillColor(255,255,224);
			}
		}
		for (int n = 5; n < 14; n++) {
			Arc a1 = new Arc(((n-5)*20 + 35), 80, 20, 20, 180, 180);
        
        if (n%2 == 1) {
			a1.setFillColor(255,223,0);
			}
		else {
			a1.setFillColor(255,255,224);
			}
		}
    }
}
