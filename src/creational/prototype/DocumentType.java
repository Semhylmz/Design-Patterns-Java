package creational.prototype;

public class DocumentType implements Cloneable {
    private Long id;
    private String name;

    public DocumentType() {
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
    protected DocumentType clone() throws CloneNotSupportedException {
        return (DocumentType) super.clone();
    }
}
