package BinarySearchKata;

public class BinarySearch {


    public int binSearch(int numberSearch, int[] myArray) {
        return searchThroughArray(0, myArray.length -1, numberSearch, myArray);

    }

    public int searchThroughArray(int start, int end, int numberSearch, int[] myArray){
        int middle = ((start+end) / 2);

        if(end < start)
            return -1;

        if (start == end)
            return myArray[end] == numberSearch ? end : -1;

        if (numberSearch == myArray[middle]){
            return middle;
        } else if (numberSearch > myArray[middle]){
            return searchThroughArray(middle++, end, numberSearch, myArray);
        } else
            return searchThroughArray(start, middle--,numberSearch, myArray);
    }
}
