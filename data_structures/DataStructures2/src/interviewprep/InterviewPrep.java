/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

/**
 *
 * @author panchal
 */
public class InterviewPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sampleArray[] = {1,2,3,46,3,4,44,98,23,45};
        
        int max = getMaxElement(sampleArray);
        System.out.println("Max Element of Array: " + max);
        
        int count = 4;
        int sum = getLinearSum(sampleArray, count);
        System.out.println("Linear Sum: " + sum);
        
    }

    private static int getMaxElement(int[] sampleArray) {
        int max = sampleArray[0];
        for (int i=0; i < sampleArray.length; i++) {
            if (sampleArray[i] > max) {
                max = sampleArray[i];
            }
        }
        return max;
    }

    private static int getLinearSum(int[] sampleArray, int count) {
        if (count == 1) {
            return sampleArray[0];
        } else {
            return getLinearSum(sampleArray, count-1) + sampleArray[count-1];
        }
    }

}
