public class CuidadorJunior implements Cuidador {
    @Override
    public void trabalhar() {
        System.out.println("Cuidador Júnior trabalhando com cuidado básico.");
    }

    @Override
    public String getDescricao() {
        return "Cuidador Júnior: Baixa experiência.";
    }
}
