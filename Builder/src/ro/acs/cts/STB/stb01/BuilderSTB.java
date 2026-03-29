package ro.acs.cts.STB.stb01;

public class BuilderSTB implements AbstractSTB{
    private AutobuzLinie autobuzLinie;

    public BuilderSTB(String modelAutobuz, String numeSofer) {
         autobuzLinie = new AutobuzLinie(modelAutobuz,numeSofer,false,false,false);

    }




    @Override
    public AutobuzLinie build() {
        return this.autobuzLinie;
    }

    @Override
    public AbstractSTB set_ModelAutobuz(String modelAutobuz) {
        this.autobuzLinie.setModelAutobuz(modelAutobuz);
        return this;
    }

    @Override
    public AbstractSTB set_numeSofer(String numeSofer) {
        this.autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    @Override
    public AbstractSTB set_textDerulator(boolean textDerulator) {
        this.autobuzLinie.setTextDerulator(textDerulator);
        return this;
    }

    @Override
    public AbstractSTB set_oprireCapatLinie(boolean oprireCapatLinie) {
        this.autobuzLinie.setOprireCapatLinie(oprireCapatLinie);
        return this;
    }

    @Override
    public AbstractSTB set_deschideUsiInFiecareStatie(boolean deschideUsiInFiecareStatie) {
         this.autobuzLinie.setDeschideUsiInFiecareStatie(deschideUsiInFiecareStatie);
         return this;
    }
}
