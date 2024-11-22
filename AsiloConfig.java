public class AsiloConfig {
    private static AsiloConfig instance;
    private int maxCuidadores;

    private AsiloConfig() {
        this.maxCuidadores = 10; // Número inicial de cuidadores permitidos
    }

    public static AsiloConfig getInstance() {
        if (instance == null) {
            instance = new AsiloConfig();
        }
        return instance;
    }

    public int getMaxCuidadores() {
        return maxCuidadores;
    }

    public void setMaxCuidadores(int maxCuidadores) {
        this.maxCuidadores = maxCuidadores;
    }
}
