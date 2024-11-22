public class Main {
    public static void main(String[] args) {
        // Usando o Singleton para acessar as configurações do sistema
        AsiloConfig config = AsiloConfig.getInstance();
        System.out.println("Número máximo de cuidadores permitidos: " + config.getMaxCuidadores());

        // Criando cuidadores usando o padrão Factory
        Cuidador cuidador1 = CuidadorFactory.criarCuidador("junior");
        Cuidador cuidador2 = CuidadorFactory.criarCuidador("pleno");
        Cuidador cuidador3 = CuidadorFactory.criarCuidador("senior");

        // Exibindo a descrição dos cuidadores
        System.out.println(cuidador1.getDescricao());
        System.out.println(cuidador2.getDescricao());
        System.out.println(cuidador3.getDescricao());

        // Cuidadores realizando o trabalho
        cuidador1.trabalhar();
        cuidador2.trabalhar();
        cuidador3.trabalhar();
    }
}
