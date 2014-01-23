public class Main {

    public static void main(String[] args) {

        char[] sentence = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'A', 'H', 'O', 'O'};

        for (char i : sentence) {
            System.out.print(i);
        }

        reverse(sentence, 0, sentence.length-1);

        System.out.println();

        for (char i : sentence) {
            System.out.print(i);
        }

        int start = 0;
        for(int i=0; i<sentence.length; i++) {
            if (sentence[i] == ' ') {
                reverse(sentence, start, i-1);
                start = i+1;
            }
        }

        System.out.println();

        for (char i : sentence) {
            System.out.print(i);
        }

    }

    private static void reverse(char[] sentence, int startIndex, int endIndex) {
        char temp;
        int length = endIndex - startIndex + 1;
        if (startIndex != endIndex) {
            for (int i=startIndex; i<=(length)/2-1; i++) {
                temp = sentence[i];
                sentence[i] = sentence[(startIndex+length)-i-1];
                sentence[(startIndex+length)-i-1] = temp;
            }
        }
    }
}
