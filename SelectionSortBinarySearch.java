package Sorts;

/**
 * Created by Admin on 16-12-2016.
 */
public class SelectionSortBinarySearch {

    private static final int MAX_ARRAY_SIZE = 50;

    private int[] theArray = new int[MAX_ARRAY_SIZE];

    private int arraySize = 10; //maximum array size.

    public int[] getTheArray() {
        return theArray;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setTheArray(int[] theArray) {
        this.theArray = theArray;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public void buildArray(){
        for (int i=0;i<arraySize;i++){
            theArray[i]=(int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        System.out.println("=============");
        for (int i=0;i<arraySize;i++){
            System.out.println(i+"|"+theArray[i]);
        }
        System.out.println("=============");
    }

    public int getValueAtIndex(int index){
        if(index<arraySize)
            return theArray[index];
        return 0;
    }

    public boolean isValuePresentInArray(int value){
        for (int i=0;i<arraySize;i++) {
            if(value==theArray[i])
                return true;
        }
        return false;
    }

    public String getIndexOfValue(int value){
        String indexValues="";
        for (int i=0;i<arraySize;i++) {
            if(value==theArray[i]) {
                indexValues += i + " ";
            }
        }
        return indexValues;
    }

    public void deleteValueAtIndex(int index){
        if(index<arraySize){
            for (int i=index;i<arraySize-1;i++){
                theArray[i]=theArray[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value){
        if(arraySize<MAX_ARRAY_SIZE){
            theArray[arraySize]=value;
            arraySize++;
        }
    }

    private void selectionSort() {
        for(int i= 0 ;i < arraySize ; i++){
            int minimum = i;
            for(int j = i; j< arraySize;j++){
                if(theArray[minimum] > theArray[j]){
                    minimum = j ;
                }
            }
            swapValues(i,minimum);
        }
    }


    private void swapValues(int indexOne, int indexTwo) {
        int temp=theArray[indexOne];
        theArray[indexOne]=theArray[indexTwo];
        theArray[indexTwo]=temp;
    }

    public int binarySearch(int value){
        int lowIndex = 0;
        int highIndex = arraySize-1;
        int index = -1;
        while(lowIndex <= highIndex){
            int middleIndex = (highIndex+lowIndex) /2;
            if(theArray[middleIndex]<value){
                lowIndex = middleIndex +1 ;
            }else if(theArray[middleIndex] > value){
                highIndex = middleIndex -1;
            }else{
                index = middleIndex;
                lowIndex = highIndex +1;
            }
        }
        return index;
    }
    public static void main(String args[]){
        SelectionSortBinarySearch arrayStructures = new SelectionSortBinarySearch();
        arrayStructures.buildArray();
        arrayStructures.printArray();
        arrayStructures.selectionSort();
        arrayStructures.printArray();
        int index =arrayStructures.binarySearch(13);
        if( index != -1){
            System.out.println("Value Found at index" + index);
        }
    }



}
