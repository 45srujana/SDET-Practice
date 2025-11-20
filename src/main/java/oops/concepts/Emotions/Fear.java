package oops.concepts.Emotions;

import oops.concepts.Data.GitaQuote;

public class Fear extends Emotions {
    public Fear(){
        super("Fear");
    }

    @Override
    public void generateQuote() {
        quote=new GitaQuote("BG-12,15","fear arises from attachment." +
                " It’s not the situation itself, but the mind’s dependence on a specific outcome that" +
                " gives birth to anxiety.\n" + "When someone is attached to their job, they fear losing it." +
                " When attached to others’ opinions, they fear judgment." +
                " When attached to control, they fear uncertainty.\n"
                + "The Bhagavad Gita does not say “don’t care.” It teaches: care deeply, but don’t cling. " +
                "Viewing people, events, and even one’s own success as gifts from God—not guarantees—begins to" +
                " loosen the grip of fear.");
    }
}
