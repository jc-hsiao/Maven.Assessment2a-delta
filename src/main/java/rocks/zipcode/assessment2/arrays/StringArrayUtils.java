package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        List<String> a = new ArrayList<>();
        Collections.addAll(a,arrayToBeSpliced);
        List<String> b;
        try {
            b = a.subList(startingIndex, endingIndex);

        }catch(Exception e){
            if(startingIndex>arrayToBeSpliced.length-1 || endingIndex>arrayToBeSpliced.length-1){
                throw new ArrayIndexOutOfBoundsException();
            }else{
                throw new IllegalArgumentException();
            }
        }
        return b.toArray(new String[0]);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> a = new ArrayList<>();
        Collections.addAll(a,arrayToBeSpliced);

        List<String> b  = a.subList(startingIndex, arrayToBeSpliced.length);
        return b.toArray(new String[0]);
    }
}
