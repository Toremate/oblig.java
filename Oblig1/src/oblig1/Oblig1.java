package oblig1;

import static javax.swing.JOptionPane.*;

public class Oblig1 {
    public static void main(String[] args) {
        String navn = showInputDialog ("Hva heter favorittstudenten din?");
        String tenk = ("Tenk at ");
        String naila = (" har naila oblig 1 allerede!");
        showMessageDialog(null,tenk + navn + naila);
    }
}
