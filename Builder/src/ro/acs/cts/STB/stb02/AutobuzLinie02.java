package ro.acs.cts.STB.stb02;

public class AutobuzLinie02 {

    private  String modelAutobuz;
    private  String numeSofer;
    private  boolean textDerulator;
    private  boolean oprireCapatLinie;
    private  boolean deschideUsiInFiecareStatie;

    public AutobuzLinie02(String modelAutobuz, String numeSofer, boolean textDerulator, boolean oprireCapatLinie, boolean deschideUsiInFiecareStatie) {
        this.modelAutobuz = modelAutobuz;
        this.numeSofer = numeSofer;
        this.textDerulator = textDerulator;
        this.oprireCapatLinie = oprireCapatLinie;
        this.deschideUsiInFiecareStatie = deschideUsiInFiecareStatie;
    }

    public void setModelAutobuz(String modelAutobuz) {

        this.modelAutobuz = modelAutobuz;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setTextDerulator(boolean textDerulator) {
        this.textDerulator = textDerulator;
    }

    public void setOprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

    public void setDeschideUsiInFiecareStatie(boolean deschideUsiInFiecareStatie) {
        this.deschideUsiInFiecareStatie = deschideUsiInFiecareStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie02{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", textDerulator=").append(textDerulator);
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", deschideUsiInFiecareStatie=").append(deschideUsiInFiecareStatie);
        sb.append('}');
        return sb.toString();
    }
}
