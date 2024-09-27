
public class Circle {

    int area;
    int radii;
    int circumference;
    final double pi=Math.PI;
    public void computeArea(){
        area=(int )(pi*radii*radii);

    }
    public void computeCircumference(){
        circumference=(int )(2*pi*radii);

    }



    public void setRadii(int radii) {
        this.radii = radii;
    }


}