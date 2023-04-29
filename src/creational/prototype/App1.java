package creational.prototype;

import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        Date firstDate1 = new Date();
        Document document1 = generalEntityService.findDocumentById(1L);
        documentAndTimePrint(firstDate1, document1);

        /*Date firstDate2 = new Date();
        Document document2 = generalEntityService.findDocumentById(2L);
        documentAndTimePrint(firstDate2, document2);*/

        Date firstDate3 = new Date();
        Document documentClone = null;
        try {
            documentClone = document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        documentClone.setName("Daily");
        documentClone.setData("Dear daily..");
        documentClone.getDocumentType().setName("Personal 2");

        documentAndTimePrint(firstDate3, documentClone);

        System.out.println(document1);

    }

    private static void documentAndTimePrint(Date firstDate1, Document document) {
        Date lastDate = new Date();
        Long differentDate = lastDate.getTime() / 1000 - firstDate1.getTime() / 1000;
        System.out.println(document);
        System.out.println(differentDate + "\n");
    }
}
