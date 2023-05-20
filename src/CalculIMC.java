import javax.swing.JOptionPane;

public class CalculIMC {
    public static void main(String[] args) {
        int subponderalM = 0;
        int normalM = 0;
        int supraponderalM = 0;
        int subponderalF = 0;
        int normalF = 0;
        int supraponderalF = 0;

        int numarPersoane = Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul de persoane: "));
        String persoaneVerificate = "";

        for (int i = 0; i < numarPersoane; i++) {
            String nume = JOptionPane.showInputDialog("Introduceti numele persoanei " + (i + 1) + ": ");
            double greutate = Double.parseDouble(JOptionPane.showInputDialog("Introduceti greutatea persoanei " + nume + " in kilograme: "));
            double inaltime = Double.parseDouble(JOptionPane.showInputDialog("Introduceti inaltimea persoanei " + nume + " in metri: "));
            String gen = JOptionPane.showInputDialog("Introduceti genul persoanei " + nume + " (M sau F): ");

            double imc = greutate / (inaltime * inaltime);

            if (gen.equalsIgnoreCase("M")) {
                if (imc < 20) {
                    subponderalM++;
                } else if (imc < 25) {
                    normalM++;
                } else {
                    supraponderalM++;
                }
            } else if (gen.equalsIgnoreCase("F")) {
                if (imc < 19) {
                    subponderalF++;
                } else if (imc < 24) {
                    normalF++;
                } else {
                    supraponderalF++;
                }
            }

            persoaneVerificate += "Persoana: " + nume + ", IMC: " + imc + "\n";
        }

        String statistici = "Statistici IMC:\n\n";
        statistici += "1) Persoane cu gen M și sunt \"Subponderal\": " + subponderalM + "\n";
        statistici += "2) Persoane cu gen M și sunt \"Normal\": " + normalM + "\n";
        statistici += "3) Persoane cu gen M și sunt \"Supraponderali\": " + supraponderalM + "\n";
        statistici += "4) Persoane cu gen F și sunt \"Subponderal\": " + subponderalF + "\n";
        statistici += "5) Persoane cu gen F și sunt \"Normal\": " + normalF + "\n";
        statistici += "6) Persoane cu gen F și sunt \"Supraponderali\": " + supraponderalF + "\n";

        JOptionPane.showMessageDialog(null, statistici + "\nPersoane verificate:\n\n" + persoaneVerificate);
    }
}
