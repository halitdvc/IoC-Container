package IoC.Container.IoC.Container.Coupling;

public class Kosanlar {
    private Araci araci;
    public Kosanlar (Araci araci) {
        this.araci = araci;
    }
    public void kosmayaBasla(){
        this.araci.hareket();
    }
}
