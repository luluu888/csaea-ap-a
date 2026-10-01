package Webtoon;
public class WebtoonTester {
    public static void main(String[] args) {
        Webtoon superfish = new Webtoon("Superfish", "Peglo", "Supernatural");
        Webtoon ywim = new Webtoon("Your Wings in Mine", "hakeism", "Comedy");

        superfish.getTitle();
        superfish.setTitle("Scuttlebox");
        superfish.getTitle();
        superfish.read();
        superfish.updateWebtoon(3);
        superfish.viewDesc();
        superfish.commentEpisode("Superfish is the strongest witch!");
        superfish.subscribe();
        superfish.moveOriginal();
        superfish.rateWebtoon(5.0);
        


        ywim.read();
        ywim.updateWebtoon(5);
        ywim.viewDesc();
        ywim.commentEpisode("Sheatiel likes lemon candy.");
        ywim.subscribe();
        ywim.moveOriginal();
        ywim.rateWebtoon(4.6);
       
}
}
