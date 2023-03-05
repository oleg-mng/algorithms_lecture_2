public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
        };
        directSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosistion = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosistion]) {
                    minPosistion = j;
                }
            }
            if(i != minPosistion){
                int temp = array[i];
                array[i] = array[minPosistion];
                array[minPosistion] = temp;
            }
        }
    }
}
