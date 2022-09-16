package inheritance;


public class Point3D extends Point {

    int z = 30;
    @Override
    public String getLocation() {
//        return "현재 위치 :" + " x:" + super.x + " y:" + super.y + " z:" + this.z;
        return super.getLocation() + " z:" + z;
    }
}
