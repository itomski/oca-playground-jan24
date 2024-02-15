package de.lubowiecki.designpatterns.adapter;

public class TweetToMessageAdapter implements Message {

    private Tweet tweet;

    public TweetToMessageAdapter(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public void compute() {

        System.out.println("--- SEND TWEET ---");
        System.out.println("--- AT: " + tweet.getCreatedAt());
        System.out.println("--- FROM: " + tweet.getAutor());
        System.out.println("--- TAGS: #" + String.join(", #", tweet.getTags()));
        System.out.println("--- BODY: " + tweet.getBody());
        System.out.println();

        // tweet.print();
    }
}
