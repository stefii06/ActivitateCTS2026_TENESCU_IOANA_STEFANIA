package ro.ase.cts.clase;

public class Rezervare implements RezervareAbstracta {

    public String numeClient;
    public int oraRezervare;
    private int ziuaReservarii;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaReservarii, String numarTelefon) {
        if(numeClient.length()>1){
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "necunoscut";
        }


        if(oraRezervare<23 && oraRezervare>9 ){
            this.oraRezervare = oraRezervare;

        } else {
            this.oraRezervare = 9;
        }

        if(ziuaReservarii<30){
            this.ziuaReservarii = ziuaReservarii;
        }
        else {
            this.ziuaReservarii = 1;
        }
        if(numarTelefon.length()==10){
            this.numarTelefon = numarTelefon;
        }else{
            this.numarTelefon = "07xxxxxxxxx";
        }

    }


    private Rezervare() {
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;
        rezervareNoua.ziuaReservarii = this.ziuaReservarii;
        return rezervareNoua;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaReservarii=").append(ziuaReservarii);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setZiuaReservarii(int ziuaReservarii) {
        if(ziuaReservarii<30){
            this.ziuaReservarii = ziuaReservarii;
        }
        else {
            this.ziuaReservarii = 1;
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare<23 && oraRezervare>9 ){
            this.oraRezervare = oraRezervare;

        } else {
            this.oraRezervare = 9;
        }
    }
}
