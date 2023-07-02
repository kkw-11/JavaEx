package abstractjava;

public abstract class Head {
    // default 생성자
    public Head(){}

    public void kimchiJjigae() {
        System.out.println("김치찌개 10,000원");
    }
    public void budaeJjigae() {
        System.out.println("부대찌개 10,000원");
    }
    public void bibimbap() {
        System.out.println("비빔밥 10,000원");
    }
    public abstract void sundaeguk();
}
