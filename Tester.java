public class Tester {
  public static void main(String[] args){
    // Point pointOne = new Point(4,5);
    Point pointTwo = new Point(4,5);
    // System.out.println("The distance is " + pointOne.distanceTo(pointTwo));
    // System.out.println("Are these two points equal? " + pointOne.equals(pointTwo));
    Triangle threePoints = new Triangle(0,0,10,0,5,5);
    System.out.println("The perimeter is " + threePoints.getPerimeter());
    System.out.println("The area is " + threePoints.getArea());
    System.out.println("The triangle is " + threePoints.classify());
    System.out.println("The points are " + threePoints.toString());
    threePoints.setVertex(2, pointTwo);
    System.out.println("The points are " + threePoints.toString());
  }
}
