package behavior.interpreter.interpreter;

import behavior.interpreter.language.CrowLang;

public class CrowInterpreter implements Interpreter {
    @Override
    public String interpreter(String content) {
        CrowLang crowLang = new CrowLang();
        String tr = crowLang.translate(content);
        return tr;
    }
}
