public class Main {

    /**
     * Write a program to replace space char with '%20'
     * Space limitatons, no extra array allowed to be used.
     *
     * @param args
     */
    public static void main(String[] args) {

        char[] input = {'T', 'H', 'I', 'S', ' ', 'I', 'S', ' ', 'Y', 'A', 'H', 'O', 'O'};

        // New Array Length Calculation
        int count = 0;
        for(char c : input) {
            if(c == ' ') {
                count++;
            }
        }

        int length = input.length + (2 * count);

        print(input);
        replaceSpace(input, length);

    }

    private static void print(char[] input) {
        for(int i=0; i<input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println();
    }

    private static void replaceSpace(char[] input, int length) {
        char[] output = new char[length];
        int endPointer = length-1;
        for(int i=input.length-1; i>=0; i--) {
            if(input[i] == ' ') {
                output[endPointer] = '0';
                output[--endPointer] = '2';
                output[--endPointer] = '%';
                endPointer--;
            } else {
                output[endPointer] = input[i];
                endPointer--;
            }
        }
        print(output);
    }
}
