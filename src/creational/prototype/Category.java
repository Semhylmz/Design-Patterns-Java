package creational.prototype;

public class Category implements Cloneable {
    private Long id;
    private String name;

    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected Category clone() throws CloneNotSupportedException {
        return (Category) super.clone();
    }
}
