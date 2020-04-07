package TimKiemNhiPhan;

public class BinarySearch {
    public int binarySearch(int[] arr, int indexLeft, int indexRight, int Input) {

        if (indexRight > indexLeft) {
            int indexMid = indexLeft + (indexRight - indexLeft) / 2;
            if (arr[indexMid] == Input)
                return indexMid;

            if (arr[indexMid] > Input)
                return binarySearch(arr, indexLeft, indexMid - 1, Input);

            return binarySearch(arr, indexMid + 1, indexRight, Input);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 20;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Không tìm thấy phần tử " + x);
        else
            System.out.println("Phần tử " + x + " được tìm thấy tại chỉ số " +
                    result);
    }
}
