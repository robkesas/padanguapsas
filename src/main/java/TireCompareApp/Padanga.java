public class Padanga {

    private String modelis;
    private Double kaina;
    private Double stopWet;
    private Double stopSnow;
    private Double stopDry;

    public Padanga(String modelis, Double kaina, Double stopWet, Double stopSnow, Double stopDry) {
        this.modelis = modelis;
        this.kaina = kaina;
        this.stopWet = stopWet;
        this.stopSnow = stopSnow;
        this.stopDry = stopDry;
    }
    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public Double getStopWet() {
        return stopWet;
    }

    public void setStopWet(Double stopWet) {
        this.stopWet = stopWet;
    }

    public Double getStopSnow() {
        return stopSnow;
    }

    public void setStopSnow(Double stopSnow) {
        this.stopSnow = stopSnow;
    }

    public Double getStopDry() {
        return stopDry;
    }

    public void setStopDry(Double stopDry) {
        this.stopDry = stopDry;
    }

    @Override
    public String toString() {
        return "Padanga{" + "modelis='" + modelis + '\'' + ", kaina=" + kaina + ", stopWet=" + stopWet + ", stopSnow=" + stopSnow + ", stopDry=" + stopDry + '}';
    }
}
