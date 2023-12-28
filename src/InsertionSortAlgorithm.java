public class InsertionSortAlgorithm {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void insertionSort(double[] array){
        int pos;
        double x;
        for(int i = 1; i < array.length; i++){
            System.out.println("Loop " + i + "'");
            System.out.println("Store to x : " + list[i]);
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Move " + list[pos-1] + " at index " + (pos-1) + " to index " + pos);
                array[pos] = array[pos-1];
                pos--;
            }
            System.out.println("Insert x to index " + pos);
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        for (double v : list) System.out.print(v + " ");
    }
}
