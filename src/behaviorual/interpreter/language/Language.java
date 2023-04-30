package behavior.interpreter.language;

public abstract class Language {
    private EnumLang lang;

    public Language(EnumLang enumLang) {
        this.lang = enumLang;
    }

    public String translate(String content) {
        String[] splitWords = content.split(" ");
        String tr = "";
        for (String text : splitWords) {
            String temp = toTr(text);
            tr = tr + " " + temp;
        }
        return tr;
    }

    private String toTr(String content) {
        String word = content;
        String parse = parseWord(word);
        String[] wordList = parse.split("-");
        String translateWord = parseToWord(wordList);

        return translateWord;
    }

    private String parseToWord(String[] wordList) {
        int i = 0;
        String trWord = "";
        for (String word : wordList) {
            if (i % 2 == 0) {
                trWord = trWord + word;
            }
            i++;
        }
        return trWord;
    }

    private String parseWord(String word) {
        String newWord = "";
        while (word.length() > 0) {
            String temp = getWord(word);
            newWord = newWord + temp + "-";
            word = word.replaceFirst(temp, "");
        }
        return newWord;
    }

    private String getWord(String word) {
        int size = lang.getAdd().length();
        if (word.length() < 2) {
            size = word.length();
        }
        String substring = word.substring(0, size);
        return substring;
    }
}
