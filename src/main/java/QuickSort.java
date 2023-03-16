import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 9, 0, 2, 6, 4, 4, 8, 1, 1, 1};

        sort(array,0,array.length - 1 );
//        for (int i : array) {
//            System.out.printf("%d ", array[i]);
//        }
        System.out.println(Arrays.toString(array));
    }

        public static void sort ( int[] array, int startPosition, int endPosition){
            int leftPosition = startPosition;
            int rightPosition = endPosition;
            int pivot = array[(startPosition + endPosition) / 2];
            do {
                while (array[leftPosition] < pivot) {
                    leftPosition++;
                }
                while (array[rightPosition] > pivot) {
                    rightPosition--;
                }
                if (leftPosition <= rightPosition) {
                    if (leftPosition < rightPosition) {
                        int temp = array[leftPosition];
                        array[leftPosition] = array[rightPosition];
                        array[rightPosition] = temp;
                    }
                    leftPosition++;
                    rightPosition--;
                }
            }
                while (leftPosition <= rightPosition) ;
                    if (leftPosition < endPosition) {
                        sort(array, leftPosition, endPosition);
                    }
                    if (startPosition < rightPosition) {
                        sort(array, startPosition, rightPosition);
                    }
                }

        }


