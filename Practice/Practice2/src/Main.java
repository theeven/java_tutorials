public class Main {

    public static void main(String[] args) {
        char[] input = {'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd'};

        char current = input[0];
        int count = 1;
        for (int i=1; i<input.length; i++) {
            if (current == input[i]) {
                count++;
            } else {
                System.out.print(current);
                System.out.print(count);
                current = input[i];
                count = 1;
            }
        }
    }
}
