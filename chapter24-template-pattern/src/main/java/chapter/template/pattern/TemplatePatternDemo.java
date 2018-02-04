package chapter.template.pattern;

import chapter.template.pattern.game.Cricket;
import chapter.template.pattern.game.Football;
import chapter.template.pattern.game.Game;

public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
