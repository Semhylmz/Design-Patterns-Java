package creational.prototype;

import javax.print.Doc;

public class GeneralEntityService {
    public DocumentType findDocumentTypeById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personal";

        } else if (id.compareTo(2L) == 0) {
            name = "Institutional";
        } else {
            name = "General";
        }

        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personal";

        } else if (id.compareTo(2L) == 0) {
            name = "Institutional";
        } else {
            name = "General";
        }

        category.setName(name);
        return category;
    }

    public Document findDocumentById(Long id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "Letter";
            data = "Dear X..";

        } else if (id.compareTo(2L) == 0) {
            name = "Report";
            data = "This report...";
        } else {
            name = "Traffic rules";
            data = "Cross..";
        }

        document.setName(name);
        document.setData(data);

        return document;
    }
}
