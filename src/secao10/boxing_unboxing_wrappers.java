package secao10;

public class boxing_unboxing_wrappers {
    public static void main(String[] args) {
        int x = 20;

        // boxing: stack aponta pro heap
        Object obj = x;

        System.out.println(obj);

        // unboxing: heap aponta pro stack
        int y = (int) obj; // com o casting

        System.out.println(y);
    }
}
