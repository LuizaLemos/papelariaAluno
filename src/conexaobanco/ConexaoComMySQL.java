package conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComMySQL {

    public static String status = "Não conectou...";

//Método Construtor da Classe//
    public ConexaoComMySQL() {

    }

//Método de Conexão//
    public static Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection

        try {

// Carregando o JDBC Driver padrão
            String driverName = "com.mysql.jdbc.Driver";      //encontra-se na biblioteca                  
           
         
            Class.forName(driverName);

// Configurando a nossa conexão com um banco de dados//
            String serverName = "127.0.0.1:3306";    //caminho do servidor do BD

            String mydatabase = "papelaria";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;//server:numeroDaPorta

            String username = "root";        //nome de um usuário de seu BD      

            String password = "";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (connection != null) {

                status = ("STATUS: Conectado com sucesso!");

            } else {

                status = ("STATUS: Não foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

//Não conseguindo se conectar ao banco
            System.out.println("Não foi possivel conectar ao Banco de Dados.");

            return null;
        }

    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {

        return status;

    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            ConexaoComMySQL.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    //Método que reinicia sua conexão//
    public static Connection ReiniciarConexao() {

        FecharConexao();
        return ConexaoComMySQL.getConexaoMySQL();
    }
}

