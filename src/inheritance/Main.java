package inheritance;

public class Main {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();
        child.age = 10;
        System.out.println(child.age);
//        parent.play();
        parent.myWork("안진명");
        child.myWork("안윤빈");

//        Point point = new Point();
//        Point3D point3D = new Point3D();
//
//        System.out.println(point.getLocation());
//        System.out.println(point3D.getLocation());

    }
}


