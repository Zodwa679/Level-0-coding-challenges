public class AddValues {
    public static void main(String args[]) {
        addvaluesTogether(0, 1);
    }

    public static void addvaluesTogether(int x, int y){
        System.out.println(x);
        System.out.println(y);
        x = x + 3;
        y = y + x;
        System.out.println(x);
        System.out.println(y);
    }
}