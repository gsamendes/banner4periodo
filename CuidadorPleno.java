public class CuidadorPleno implements Cuidador {
    @Override
    public void trabalhar() {
        System.out.println("Cuidador Pleno trabalhando com maior eficiência.");
    }

    @Override
    public String getDescricao() {
        return "Cuidador Pleno: Experiência moderada.";
    }
}
