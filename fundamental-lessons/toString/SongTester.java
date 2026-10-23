public class SongTester {
    public static void main(String[] args){
        Song a = new Song("1&Only", "XLOV");

        a.play();
        a.play();
        a.play();

        //System.out.println(a.toString()); -- does the exact same thing as printing because of the toString method
        System.out.println(a);

        a.getPlays();

        a.getStars();


        // ===== CHALLENGE 1 =====
    // "1 plays" is wrong. Fix toString() so it returns "1 play" for one play
    // and "plays" for everything else.  Tool: if/else

    }
}
