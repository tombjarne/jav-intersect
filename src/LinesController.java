public class LinesController {

    Point p1l1 = new Point(10.8, 3.3);
    Point p2l1 = new Point(3.3, 7.8);

    Point p1l2 = new Point(1.2, 90);
    Point p2l2 = new Point(7.5, 6.3);

    Line line1 = new Line(p1l1, p2l1);
    Line line2 = new Line(p1l2, p2l2);

    public Boolean linesIntersect(Line line1, Line line2) throws Exception {
        if (line1.getPitch().equals(line2.getPitch())) {
            return false;
        }

        try {
            double intersectionX = line1.getPitch() - line2.getPitch();
            Point intersection = new Point(intersectionX, line1.getPitch() * intersectionX);
            transformLines(line1, line2);

            isInBounds();

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    //function to rotate function so it stands upright with a 90 degrees angle to the x-axis and to also transform line2 accordingly
    public void transformLines(Line line1, Line line2) {

        double deviation;

        if(line1.getPitch() > line2.getPitch()) {
            deviation = line1.getPitch() - line2.getPitch();
        } else {
            deviation = line2.getPitch() - line2.getPitch();
        }

        line1.computeCenter();

        //correction Line
        Point p1cl = new Point(line1.getTop().getX(), line1.getTop().getY());
        Point p2cl = new Point(line1.getBottom().getX(), line1.getBottom().getY());
        Line correctionLine = new Line();



    }

    public Boolean isInBounds(Line line1, Line line2, Point intersection) {
        double xp1l1 = line1.getTop().getX();
        double yp1l1 = line1.getTop().getY();
        double xp2l1 = line1.getBottom().getX();
        double yp2l1 = line1.getBottom().getY();

        double xp1l2 = line2.getTop().getX();
        double yp1l2 = line2.getTop().getY();
        double xp2l2 = line2.getBottom().getX();
        double yp2l2 = line2.getBottom().getY();

        double xip1 = intersection.getX();
        double yip1 = intersection.getY();

        //check if intersection point is in or out of bounds of line points (top and bottom)
        if ((xip1 < xp1l1 || xip1 > xp2l1) && (yip1 < yp1l1 || yip1 > yp1l2)) {

        }

        if ((xip1 > xp1l1 && xip1 >xp2l2)&&(xip1 < xp1l1)) {

        }
    }
}
