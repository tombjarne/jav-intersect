public class Line {

    private Point top;
    private Point bottom;
    private Point center;
    private double pitch;

    public Line(Point top, Point bottom) {
        this.top = top;
        this.bottom = bottom;
        this.center = computeCenter();
    }

    public Point computeCenter() {
        double xDeviation = (top.getX() - bottom.getX())/2;
        double yDeviation = (top.getY() - bottom.getY())/2;
        Point center = new Point(bottom.getX() + xDeviation, bottom.getY() + yDeviation);
        return center;
    }

    public Double getXDist() {
        return Math.pow((this.top.getX() - this.bottom.getX()), 2);
    }

    public Double getYDist() {
        return Math.pow((this.top.getY() - this.bottom.getY()), 2);
    }

    public Double computeDistBetween() {
        return (Math.sqrt(getXDist() + getYDist()));
    }

    public Double computePitch() {
        pitch = (this.top.getY() - this.bottom.getY() / (this.top.getX() - this.top.getX()));
        return pitch;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public Point getTop() {
        return this.top;
    }

    public Point getBottom() {
        return this.bottom;
    }
}
