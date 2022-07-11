package Lambda;

public class Universite {


        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 arklı obj'den List create ediniz.
           pojo class==> plan old java object --> model class

           private veriable olur
           costructor
           getter ve setter olur
           toString olur

 */

    public Universite() {
    }

    public Universite(String universite, String bolum, int ogrenciSayisi, int notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    private String universite;
    private String bolum;
    private int ogrenciSayisi;
    private int notOrt;

    @Override
    public String toString() {
        return "Universite{" +
                "universite='" + universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrt=" + notOrt +
                "\n";
    }
}
