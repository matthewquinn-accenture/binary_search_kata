package BinarySearchKata;

public class BinarySearch {


    public int binSearch(int numberSearch, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == numberSearch){
                return i;
            }
        }
        return -1;

    }
}
