package ro.acs.cts.STB.stb01;

public interface AbstractSTB {
    AutobuzLinie build();
    AbstractSTB set_ModelAutobuz( String modelAutobuz );
    AbstractSTB set_numeSofer( String numeSofer );
    AbstractSTB set_textDerulator( boolean textDerulator );
    AbstractSTB set_oprireCapatLinie( boolean oprireCapatLinie );
    AbstractSTB set_deschideUsiInFiecareStatie( boolean deschideUsiInFiecareStatie );
}
