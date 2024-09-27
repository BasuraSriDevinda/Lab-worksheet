

public class Q5 {
    public static void main(String[] args) {
        Circle smallCircle = new Circle();

        Circle bigCircle= new Circle();
        int radiusOfSmallCircle=7;
        int radiusOfbigCircle=14;
        smallCircle.setRadii(radiusOfSmallCircle);
        bigCircle.setRadii(radiusOfbigCircle);
        smallCircle.computeArea();
        bigCircle.computeArea();
        System.out.println(smallCircle.area);
        System.out.println(bigCircle.area);
        System.out.println("shaded area = "+(bigCircle.area-smallCircle.area));


    }
}