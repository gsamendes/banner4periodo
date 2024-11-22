public class CuidadorSenior implements Cuidador {
    @Override
    public void trabalhar() {
        System.out.println("Cuidador Sênior trabalhando com alta experiência e liderança.");
    }

    @Override
    public String getDescricao() {
        return "Cuidador Sênior: Alta experiência.";
    }
}
