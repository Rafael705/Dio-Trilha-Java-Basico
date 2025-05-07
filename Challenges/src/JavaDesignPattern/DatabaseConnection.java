package JavaDesignPattern;

public class DatabaseConnection {
    private static DatabaseConnection instancia;

    private DatabaseConnection(){
        System.out.println("Conexão com o banco estabelecida!");
    }
    public static DatabaseConnection getInstance(){
        if (instancia == null){
            instancia = new DatabaseConnection();
        }
        return instancia;
    }
    public void connect(){
        System.out.println("Usando a conexão com o banco...");
    }

}
