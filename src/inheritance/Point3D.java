package inheritance;


public class Point3D extends Point {

    int z = 30;
    @Override
    public String getLocation() {
//        return "νμ¬ μμΉ :" + " x:" + super.x + " y:" + super.y + " z:" + this.z;
        return super.getLocation() + " z:" + z;
    }
}
