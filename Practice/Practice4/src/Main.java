public class Main {

    public static void main(String[] args) {

        char[] input = {'a', 'b', 'c', 'd', 'a', 'e', 'b', 'c', 'f'};

        print(input);
        removeDuplicates(input);
        print(input);

    }

    private static void print(char[] input) {
        for(char c : input) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void removeDuplicates(char[] input) {

        if(input == null) {
            return;
        }

        if(input.length == 1) {
            return;
        }

        for(int i=0; i<input.length; i++) {
            for(int j=i+1; j<input.length; j++) {
                if(input[i] == input[j]) {
                    input[j] = 0;
                }
            }
        }
    }
}
