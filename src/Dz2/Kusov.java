package Dz2;

public class Kusov {
    private int volume;
    private String metal;
    private String form;

    public int twiceVolume(){
        return this.volume*2;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Kusov(int volume, String metal, String form) {
        this.volume = volume;
        this.metal = metal;
        this.form = form;
    }

    @Override
    public String toString() {
        return "Kusov{" +
                "volume=" + volume +
                ", metal='" + metal + '\'' +
                ", form='" + form + '\'' +
                '}';
    }
}
