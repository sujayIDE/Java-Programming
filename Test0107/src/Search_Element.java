class A {
    boolean containsElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
            return false;
    }
}

public class Search_Element {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        A a = new A();
        System.out.println(a.containsElement(arr,30));
        System.out.println(a.containsElement(arr,50));
    }
}