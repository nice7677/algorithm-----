package practice;

public class ReverseAndSwapPractice {

    public static void main(String[] args) {
        ReverseAndSwapPractice rs = new ReverseAndSwapPractice();
        rs.reverse(new int[]{5, 10, 73, 2, -5, 42});
    }

    public void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("Swap finish");
    }

    public void swap(int[] a, int i1, int i2) {
        int t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
        System.out.println(i1 + "와 " + i2 + "를 Swap");
    }

}
