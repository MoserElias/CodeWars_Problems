public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }

        if (names.length == 1) {
            String name = names[0];
            return name + " likes this";
        }

        if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }

        if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }

        if (names.length >= 4) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
