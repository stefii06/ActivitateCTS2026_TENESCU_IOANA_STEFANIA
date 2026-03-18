package ro.ase.cts.clase;

public class Opera {
    private String numeOpera;
    private int nrLocuri;
    private int nrSpectacoleMax;
    private static Opera instance=null;

    private Opera(String numeOpera, int nrLocuri, int nrSpectacoleMax) {
        this.numeOpera = numeOpera;
        this.nrLocuri = nrLocuri;
        this.nrSpectacoleMax = nrSpectacoleMax;
    }

    public static Opera getInstance(String numeOpera, int nrLocuri, int nrSpectacoleMax) {
        if (instance == null) {
           instance = new Opera(numeOpera, nrLocuri, nrSpectacoleMax);
        }
        return instance;
    }



    public void afiseazaDetalii(){
        StringBuilder sb = new StringBuilder("Opera detalii:");
        sb.append("\n nume:").append(this.numeOpera);
        sb.append("\n nrLocuri:").append(this.nrLocuri);
        sb.append("\n nrSpectacoleMax:").append(this.nrSpectacoleMax);
        System.out.println(sb.toString());
    }



}
