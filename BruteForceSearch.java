// Experiment 1.a
// ALGORITHM SequentialSearch(A, n, key)
//     Input: A - array of n elements, key - element to be searched
//     Output: Index of the key if found, otherwise -1
//     for i ← 0 to n - 1 do
//         if A[i] == key then
//             return i // Return the index of the found element
//     return -1 // Key not found in the array 
class BruteForceSearch{
    public static int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        long st=System.nanoTime();
        int[] arr={1,2,3,4,5};
        System.out.println(search(arr,3));
        long et=System.nanoTime();
        System.out.println("Time Taken: "+(et-st));
    }
}