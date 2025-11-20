package oops.concepts.Service;

import oops.concepts.Emotions.Anger;
import oops.concepts.Emotions.Emotions;
import oops.concepts.Emotions.Fear;

public class EmotionResolver {
    public static Emotions getEmotion(String input) {
        if (input == null) {
            return null;
        }


        switch (input.toLowerCase()) {
            case "anger":
                return new Anger();
            case "fear":
                return new Fear();

            default:
              return null;

        }


    }
}

