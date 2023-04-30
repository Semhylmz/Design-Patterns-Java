package behaviorual.visitor;

import java.util.ArrayList;
import java.util.List;

public class Il {
    private String adi;
    private List<Hastahane> hastahaneList;

    public Il(String adi) {
        this.adi = adi;
        hastahaneList = new ArrayList<>();
    }

    public void hastaEkle(Hastahane hastahane) {
        hastahaneList.add(hastahane);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hastahane> getHastaList() {
        return hastahaneList;
    }

    public void setHastaList(List<Hastahane> hastahane) {
        this.hastahaneList = hastahane;
    }
}
