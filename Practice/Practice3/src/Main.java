public class Main {

    //Usage of MyHashMap here!
    public static void main(String[] args) {

        MyHashMap testMap = new MyHashMap(8);
        try {
            testMap.put(13, "Deven");
            testMap.put(14, "Sejal");
            testMap.put(15, "Dina");
            testMap.put(16, "Mukesh");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(testMap.get(13));
        System.out.println(testMap.get(14));
        System.out.println(testMap.get(15));
        System.out.println(testMap.get(16));



    }
}
