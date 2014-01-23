import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        char[] input1 = {'A', 'A', 'H', 'C', 'D', 'B', 'A', 'B', 'C'};
        char[] input2 = {'A', 'B', 'C'};

        HashMap<Character, Integer> pointers = new HashMap<Character, Integer>(input2.length);

        Boolean flag = false;
        int min;
        for(int i=0; i<input1.length; i++) {

            //Iterate only on start till we get fill pointer hash map
            if(!flag) {
                for(int j=0; j<input2.length; j++) {
                    if(input1[i] == input2[j]) {
                        pointers.put(input1[i], i);
                    }
                }
            }

            //Once hashmap is loaded then we can proceed with normal length finding op.
            if(pointers.size() == input2.length) {
                flag=true;
            } else {
                continue;
            }

            //Find length

            //Forward least pointer to next loc.

            //Repeat

        }

    }

}
