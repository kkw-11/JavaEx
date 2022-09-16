package variable;

public class ReferenceREturnEx {
    public static void main(String[] args) {
        //1.
        Data d = new Data();
        d.x = 10;
        //2.
        Data d2 = copy(d);
        //5.
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d){
        //3.
        Data tmp = new Data();
        tmp.x = d.x;

        //4.
        return tmp;
    }
}
