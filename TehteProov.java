public class TehteProov {
    public static void main(String[] args) {
        Tehted strings = new Tehted("karu", "püksid");
        Tehted strings2 = new Tehted("karu", "k");

        Tehted ints = new Tehted(1, 2);
        Tehted ints2 = new Tehted(2, 1);

        Tehted doubles = new Tehted(1.01, 2.02);

        Tehted stringint = new Tehted("kappi", 3);

        Tehted[] vaartused = new Tehted[]{strings, strings2, ints, ints2, doubles, stringint};

        for (Tehted t : vaartused){
            t.liida();
            t.lahuta();
        }
    }
}
