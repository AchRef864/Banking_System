package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import Metier.utilisateur;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    private Connection connection;
    
    public BanqueService() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SOAProject", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @WebMethod
    public void retirer(String ch,float mont) {
        try {
            PreparedStatement pstmt = connection.prepareStatement("UPDATE utilisateur SET montant = montant - ? WHERE login = ?");
            pstmt.setDouble(1, mont);
            pstmt.setString(2,ch);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @WebMethod
    public void verser(String ch,float mont) {
        try {
            PreparedStatement pstmt = connection.prepareStatement("UPDATE utilisateur SET montant = montant + ? WHERE login = ?");
            pstmt.setDouble(1, mont);
            pstmt.setString(2,ch);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
