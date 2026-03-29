package ro.acs.cts.STB.stb02;

import ro.acs.cts.STB.stb01.AbstractSTB;
import ro.acs.cts.STB.stb01.AutobuzLinie;

import java.awt.event.ActionListener;

public class BuilderSTB02 implements AbstractSTB02 {
    private  boolean textDerulator;
    private  boolean oprireCapatLinie;
    private  boolean deschideUsiInFiecareStatie;

    public BuilderSTB02() {
        this.textDerulator = false;
        this.oprireCapatLinie = false;
        this.deschideUsiInFiecareStatie = false;
    }

    @Override
    public AutobuzLinie02 build(String modelAutobuz, String numeSofer) {
        return new AutobuzLinie02(modelAutobuz,numeSofer,textDerulator,oprireCapatLinie,deschideUsiInFiecareStatie);
    }


    @Override
    public AbstractSTB02 set_textDerulator(boolean textDerulator) {
        this.textDerulator = textDerulator;
        return this;
    }

    @Override
    public AbstractSTB02 set_oprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
        return this;
    }

    @Override
    public AbstractSTB02 set_deschideUsiInFiecareStatie(boolean deschideUsiInFiecareStatie) {
        this.deschideUsiInFiecareStatie = deschideUsiInFiecareStatie;
        return this;
    }
}
