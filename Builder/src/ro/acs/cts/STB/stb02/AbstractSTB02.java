package ro.acs.cts.STB.stb02;

import ro.acs.cts.STB.stb01.AbstractSTB;
import ro.acs.cts.STB.stb01.AutobuzLinie;

public interface AbstractSTB02 {
    AutobuzLinie02 build( String modelAutobuz, String numeSofer);
    AbstractSTB02 set_textDerulator( boolean textDerulator );
    AbstractSTB02 set_oprireCapatLinie( boolean oprireCapatLinie );
    AbstractSTB02 set_deschideUsiInFiecareStatie( boolean deschideUsiInFiecareStatie );
}
