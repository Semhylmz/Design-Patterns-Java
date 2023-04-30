package behaviorual.visitor;

import java.util.ArrayList;
import java.util.List;

public class Il {
    private String adi;
    private List<Hasta> hastaList;

    public Il(String adi) {
        this.adi = adi;
        hastaList = new ArrayList<>();
    }

    public void hastaEkle(Hasta hasta) {
        hastaList.add(hasta);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hasta> getHastaList() {
        return hastaList;
    }

    public void setHastaList(List<Hasta> hastaList) {
        this.hastaList = hastaList;
    }
}
