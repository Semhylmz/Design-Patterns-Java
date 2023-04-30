package behavior.interpreter;

import behavior.interpreter.interpreter.BirdInterpreter;
import behavior.interpreter.interpreter.CrowInterpreter;
import behavior.interpreter.interpreter.Interpreter;

public class App {
    public static void main(String[] args) {
        String birdText = getBirdText();
        String crowText = getCrowText();

        print(birdText, new BirdInterpreter());
        print(crowText, new CrowInterpreter());

    }

    private static void print(String birdWord, Interpreter interpreter) {
        String tr = interpreter.interpreter(birdWord);
        System.out.println(tr);
    }

    private static String getBirdText() {
        return "Sacadıcık Bacahacadıcır Mecemiciş cacacıcık yecer";
    }

    private static String getCrowText() {
        return "Sagadıgık Bagahagadıgır Megemigiş cagacıgık yeger";

    }
}
