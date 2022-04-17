public class BinarySearch {

    public static int binarySearch(int list[], int left, int right, int current) {
        if (left > right) return -1;

        int position = left + (right - left) / 2;
        if (list[position] == current) return position;

        if (list[position] < current) {
            return binarySearch(list, position + 1, right, current);
        } else {
            return binarySearch(list, left, position-1, current);
        }
    }

    public static void main(String[] args) {
        int numberList[] = {10,15,20,30,40,50,55,60,68,70,77};
        int current = 55;
        int right = numberList.length-1;
        int result = binarySearch(numberList, 0, right, current);
        System.out.println( (result == -1) ? "Element is not found" : "Element is found at index: " + result );
    }
}
