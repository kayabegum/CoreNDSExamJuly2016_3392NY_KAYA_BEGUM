package algorithm;

public class Sort {
    long executionTime;
    int array[];
    int first;
    int last;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    //    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */
//
    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i <= array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                while (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }

            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = (list.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;


                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int size = list.length;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        int[] temp = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int h = 0;
        while (i < left.length && j < right.length) {
            if (j > right.length || (i < left.length && left[i] < right[j])) {
                temp[h++] = left[i++];

            } else
                temp[h++] = right[j++];
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return temp;
    }

    public int[] quickSort(int[] array) {
        int[] list = array;
        final long startTime = System.currentTimeMillis();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        //implement here

        if (list == null || list.length == 0) {

        }
        this.array = list;
        int length = list.length;
        quickSort(0, length - 1);
        return list;
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);

                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }






    public int [] heapsort(int array[]) {
        // /        implement here

        int[] list = array;
        int n = list.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);


        for (int i = n - 1; i >= 0; i--) {

            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
             heapify(list, i, 0);
        }
        final long startTime = System.currentTimeMillis();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }








        public int[] bucketSort ( int[] array) {
//            int[] list = array;
            //implement here
            int maxVal=0;
            int [] list=new int[maxVal+1];

            int[] bucket = new int[maxVal + 1];

            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = 0;
            }

            for (int i = 0; i < list.length; i++) {
                bucket[list[i]]++;
            }

            int outPos = 0;
            for (int i = 0; i < bucket.length; i++) {
                for (int j = 0; j < bucket[i]; j++) {
                    list[outPos++] = i;
                }
            }
            final long startTime = System.currentTimeMillis();
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;

            return list;
        }


        public int[] shellSort ( int[] array){
            int[] list = array;
            //implement here

                int inner, outer;
                int temp;

                int h = 1;
                while (h <= list.length / 3) {
                    h = h * 3 + 1;
                }
                while (h > 0) {
                    for (outer = h; outer < list.length; outer++) {
                temp = list[outer];
                inner = outer;

                while (inner > h - 1 && list[inner - h] >= temp) {
                  list[inner] = array[inner - h];
                inner -= h;
                }
                array[inner] = temp;
                    }
               h = (h - 1) / 3;
                }



            return list;
        }
}

//
//

