public class Point {
  private double x,y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    double distance = Math.sqrt((Math.pow((other.getX() - x), 2)) + (Math.pow((other.getY() - y), 2)));
    return distance;
  }

  public boolean equals(Point other){
    return ((other.getX() == x) && (other.getY() == y));
  }
}
