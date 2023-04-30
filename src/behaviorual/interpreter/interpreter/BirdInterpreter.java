package behavior.interpreter.interpreter;

import behavior.interpreter.language.BirdLang;

public class BirdInterpreter implements Interpreter {

    @Override
    public String interpreter(String content) {
        BirdLang bird = new BirdLang();
        String res = bird.translate(content);
        return res;
    }
}
