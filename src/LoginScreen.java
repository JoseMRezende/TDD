import java.util.HashMap;
import java.util.Map;

/**
 * @author José Marcos
 * @version 3.0
 * @since Release 1.0 da aplicação
 *
 * Uma classe simples que representa uma tela de login com autenticação de usuário.
 */
public class LoginScreen {

    private Map<String, String> userDatabase;

    /**
     * Construtor para a classe LoginScreen.
     * Inicializa o banco de dados de usuários com contas de usuário padrão.
     */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tenta fazer login de um usuário verificando o nome de usuário e senha fornecidos no banco de dados de usuários.
     *
     * @param username O nome de usuário fornecido para login.
     * @param password A senha fornecida para login.
     * @return true se o login for bem-sucedido, false caso contrário.
     */
    public boolean login(String username, String password){
        if (userDatabase.containsKey(username)) {
            String senhaArmazenada = userDatabase.get(username);
            if (senhaArmazenada.equals(password)){
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo usuário ao banco de dados de usuários.
     *
     * @param username O nome de usuário do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}