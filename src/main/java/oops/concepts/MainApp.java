package oops.concepts;

import oops.concepts.Emotions.Anger;
import oops.concepts.Emotions.Emotions;
import oops.concepts.Service.EmotionResolver;

import java.util.Scanner;

import static oops.concepts.Service.EmotionResolver.getEmotion;

public class MainApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Gita Emotion Resolver");
        System.out.println("Enter Emotion(e.g., Anger,fear,sorrow)"+":" );
        String inputEmotion=sc.nextLine().trim().toLowerCase();
        //EmotionResolver emotionResolver=new EmotionResolver() ;
        Emotions emotion= getEmotion(inputEmotion);


        if(emotion!=null){
            emotion.generateQuote();
            emotion.showResolution();
        }else{
            System.out.println("Sorry, I don't have wisdom for that emotion");
        }
        sc.close();
    }
}
