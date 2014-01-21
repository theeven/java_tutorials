/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication21;

/**
 *
 * @author panchal
 */
public class IJavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Common Strings Methods. This could be really handy for loops
        
        String deven[] = {"furry", "curry", "fuckerish", "slurry"};
        
        for (String x : deven) {
            if (x.startsWith("fu")) {
                System.out.println(x);
            }
        }
        System.out.println();
        
        for (String x : deven) {
            if (x.endsWith("ry")) {
                System.out.println(x);
            }
        }
        System.out.println();
        
        // Both of the above string methods are self explanatory. startsWith & 
        // endsWith. Nows Lets learn few more.
        
        String s = "devenmukeshpanchalsejaldevenpanchal";
        // below basically gives us index of a character. pretty much below will 
        // return index of e's first instance which is 1.
        System.out.println(s.indexOf("e"));
        
        // below slightly modifies the method call, saying find first instance
        // of e but ignore first 5 characters.
        System.out.println(s.indexOf("e", 5));
        
        // incase you happen to give a character which is not contained in 
        // string at all, return result is -1.
        System.out.println(s.indexOf("x"));
        
        // now lets search sub string index.
        System.out.println(s.indexOf("pan"));
        System.out.println(s.indexOf("pan", 15));
        System.out.println();
        
        // Lets do concatanation examples. there are 2 ways, one is traditional
        // first way & 2nd is using string method.
        String a = "deven  ";
        String b = "panchal";
        System.out.println(a + b);
        System.out.println(a.concat(b));
        System.out.println();
        
        // Lets do some self explanotory method.
        System.out.println(a.replace("d", "s"));
        System.out.println(a.toUpperCase());
        
        // Trim method trims all the white spaces in a string.
        System.out.println(a.trim());
        
    }
}
