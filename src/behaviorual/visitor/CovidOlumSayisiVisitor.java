package behaviorual.visitor;

import java.util.List;

public class CovidHastaSayisiVisitor implements Visitor {
    @Override
    public String visithastahane(Hastahane hastahane) {
        int hastaSayisi = hastaSayisiHesapla(hastahane);
        return String.valueOf(hastaSayisi);
    }

    private int hastaSayisiHesapla(Hastahane hastahane) {
        return HastaHesaplaUtil.hastaSayisiHesapla(hastahane, EnumHastalik.COVID);
    }


    @Override
    public String visitIl(Il il) {
        int hastaSayisi = hastaSayisiHesapla(il);
        return String.valueOf(hastaSayisi);
    }

    private int hastaSayisiHesapla(Il il) {
        List<Hastahane> ilList = il.getHastaList();
        int hastaSayisi = 0;
        for (Hastahane hastahane : ilList) {
            int i = hastaSayisiHesapla(hastahane);
            hastaSayisi = hastaSayisi + i;
        }
        return hastaSayisi;
    }

    @Override
    public String visitUlke(Ulke ulke) {
        int hastaSayisi = hastaSayisiHesapla(ulke);
        return String.valueOf(hastaSayisi);
    }

    private int hastaSayisiHesapla(Ulke ulke) {
        List<Il> ilList = ulke.getIlList();
        int hastaSayisi = 0;
        for (Il il : ilList) {
            int i = hastaSayisiHesapla(il);
            hastaSayisi = hastaSayisi + i;
        }
        return hastaSayisi;
    }

}
