package abstractjava;

public class Main {
    public static void main(String[] args) {
        MapoBranch franchise = new MapoBranch();

        System.out.println(franchise.branchName + "의 메뉴는");

        franchise.budaeJjigae();

        franchise.sundaeguk();
    }
}
