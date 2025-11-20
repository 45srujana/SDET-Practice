package oops.concepts.Emotions;

import oops.concepts.Data.GitaQuote;

public abstract class Emotions {
    protected String emotionName;
    protected GitaQuote  quote;

    public Emotions(String emotionName){
        this.emotionName=emotionName;
    }

    //abstract method
    public abstract  void generateQuote();

    public void showResolution(){
        if(quote!=null){
            System.out.println("Resolution for" +emotionName+" : ");
            System.out.println(quote.toString());
        }else{
            System.out.println("No quotation available for " +emotionName+" : ");
        }
    }
}
