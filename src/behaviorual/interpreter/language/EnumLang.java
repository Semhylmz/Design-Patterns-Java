package behavior.interpreter.language;

public enum EnumLang {
    BIRD("Bird", "ca"),

    CROW("Crow", "ga");
    private String name;
    private String add;

    EnumLang(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
}
