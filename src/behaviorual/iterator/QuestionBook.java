package behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionBook {
    private String bookName;
    private List<Question> questionList;

    public QuestionBook(String bookName) {
        this.bookName = bookName;
        this.questionList = new ArrayList<>();

        questionList.add(new Question(1L));
        questionList.add(new Question(2L));
        questionList.add(new Question(3L));
        questionList.add(new Question(4L));
        questionList.add(new Question(5L));
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Iterator getQuestionIterator() {
        return questionList.iterator();
    }
}
