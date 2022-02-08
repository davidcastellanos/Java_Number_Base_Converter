
class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        /*try {
            System.out.println(name);

        } catch (NullPointerException e) {
            System.out.println("error" + e);
        }*/

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println(0);
        }

    }
}
