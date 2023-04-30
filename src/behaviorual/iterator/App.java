package behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        QuestionBook math = new QuestionBook("Math");
        FasiculBook mathFasicul = new FasiculBook("Math Fasicul");

        Iterator questionIterator = math.getQuestionIterator();
        print(questionIterator);

        Iterator questionIterator1 = mathFasicul.getQuestionIterator();
        print(questionIterator1);
    }

    private static void print(Iterator questionIterator) {
        while (questionIterator.hasNext()) {
            Question question = (Question) questionIterator.next();
            Long questionNo = question.getQuestionNo();
            System.out.println("Question no: " + questionNo);
        }
    }
}
