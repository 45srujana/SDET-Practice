package oops.concepts.Emotions;

import oops.concepts.Data.GitaQuote;

public class Anger extends Emotions{

    public Anger() {
        super("Anger");
    }
    @Override
    public void generateQuote(){
        quote=new GitaQuote("BG-"+"2.63",
                "From anger arises delusion; from delusion, confusion of memory;" +
                        " from confusion of memory," +
                " the destruction of intellect; and when intellect is destroyed, one is ruined.");
    }

}
