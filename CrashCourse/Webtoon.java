public class Webtoon {
    public String title;
    private String genre;
    private boolean isWebtoonOriginal;
    private int episodes;
    private String commentSection;
    private String author;
    private boolean isSubscribed;
    private int subscriptions;
    private double webtoonRating;
    private boolean isRead;
    private boolean onHiatus;
    
    public Webtoon(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;

        isWebtoonOriginal = false;
        episodes = 0;
        subscriptions = 99;
        webtoonRating = 0.0;
        isRead = false;
        onHiatus = false;
        isSubscribed = false;
    }

    public void read() {
        if (isRead = false) {
            isRead = true;
            System.out.println("You have read all that is out of " + title);
        } 
        else {
            System.out.println("There are no more new chapters. Stay tuned!");
        }
    }

    public void updateWebtoon(int updates) {
        isRead = false;
        episodes += updates;
        System.out.println("There are" + updates + "number of new episodes for" + title);
    }

    public void viewDesc() {
        System.err.println(title);
        System.err.println("by " + author);
        System.err.println("subscriptions: " + subscriptions);
        System.err.println("Genre: " + genre);
        System.err.println(episodes + " episodes");
    }

    public void commentEpisode (String comment){
        System.out.println(comment);
        commentSection += "\n" + comment;
    }

    public void subscribe (){
        if (isSubscribed = false){
            isSubscribed = true;
            subscriptions++;
            System.out.println("You have subscribed to " + title);
        }
        else {
            isSubscribed = false;
            subscriptions--;
            System.out.println("You have unsubscribed to " + title);
        }
    }

    public void moveOriginal(){
        if (isWebtoonOriginal = false && subscriptions >= 1]0) {
            isWebtoonOriginal = true;
            System.out.println(title + " by " + author + " has moved to Webtoon Originals!");
        }
        else if (isWebtoonOriginal = true) {
            System.out.println(title + "is already a Webtoon Orginal!");
        }
        else if (subscriptions < 100) {
            isWebtoonOriginal = false;
            System.out.println("There are not enough subscriptions for " + title + "to move off off CANVAS :(");
        }
    }

    public void rateWebtoon(double yourRating) {
        if (yourRating > 5.0){
            yourRating = 5.0;
            System.out.println();

        }
        webtoonRating = (yourRating + webtoonRating)/2;
    }

}
