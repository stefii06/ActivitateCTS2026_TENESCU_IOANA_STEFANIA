package ro.ase.cts.Librarie;

// ============================================
// 1. INTERFATA (Target)
// ============================================
public interface Carte {
    String getTitlu();
    String getAutor();
    double getPret();
    void achizitionare();
}