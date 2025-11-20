package oops.concepts.Data;

public class GitaQuote {
    //encapsulation - accessing private fields
    private  final String verseId;
   private final String explanation;
//constructor
    public GitaQuote(String verseId,String explanation){
        this.verseId=verseId;
        this.explanation =explanation;

    }

    public String getVerseId(){
        return  verseId;
    }
    public String getEx(){
        return explanation;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Verse : ").append(verseId).append("\n").append("Explanation - ").append(explanation);
        return  sb.toString();
    }

}
