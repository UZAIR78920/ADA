// Experiment 2.a
// ALGORITHM SelectionSort(A,n)
//     Input: A - array of n elements
//     Output: Sorted array A
//     for i ← 0 to n - 2 do
//         minIndex ← i
//         for j ← i + 1 to n - 1 do
//             if A[j] < A[minIndex] then
//                 minIndex ← j
//         Swap A[i] and A[minIndex] 
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        long st=System.nanoTime();
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long et=System.nanoTime();
        System.out.println("Time Taken: "+(et-st));
    }
}