public class AsiloConfig {
    private static AsiloConfig instance;
    private int maxCuidadores;

    // Construtor privado para evitar instanciamento externo
    private AsiloConfig() {
        this.maxCuidadores = 10; // número inicial de cuidadores permitidos
    }

    // Método para obter a única instância da configuração
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
