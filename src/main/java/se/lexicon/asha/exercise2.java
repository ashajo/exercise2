package se.lexicon.asha;

public class exercise2 {

    public static void main(String[] args) {

        int[] indexArray = new int[]{7, 3, 5, 9, 5};
        System.out.println("Index position of number 5: " + indexOf(indexArray, 5));
        System.out.println("Index position of number 6: " + indexOf(indexArray, 6));
    }

    private static int indexOf(int[] indexArray, int element){

        int index = -1;

        if(indexArray == null)
            return index;

        for(int i=0; i < indexArray.length; i++){
            if(indexArray[i] == element){
                index = i;
                break;
            }
        }

        return index;
    }
}
