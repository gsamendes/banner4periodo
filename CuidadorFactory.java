public class CuidadorFactory {
    public static Cuidador criarCuidador(String tipo) {
        if (tipo.equalsIgnoreCase("junior")) {
            return new CuidadorJunior();
        } else if (tipo.equalsIgnoreCase("pleno")) {
            return new CuidadorPleno();
        } else if (tipo.equalsIgnoreCase("senior")) {
            return new CuidadorSenior();
        }
        throw new IllegalArgumentException("Tipo de cuidador desconhecido");
    }
}
