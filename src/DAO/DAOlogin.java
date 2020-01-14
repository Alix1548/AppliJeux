package DAO;
import Modele.Adherent;

import javax.sql.DataSource;
import java.sql.*;

public class DAOlogin {

    DataSource dataSource;

    public DAOlogin(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Adherent getAdherentByLoginAndMDP (String login, String passsword){

        String sql = "select a.nom, a.adherentId from adherents a where a.login = ? AND a.password= ?;";
        try (Connection connection = dataSource.getConnection();PreparedStatement pstmt = connection.prepareStatement(sql);) {

            pstmt.setString(1, login);
            pstmt.setString(2, passsword);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){

                int id = rs.getInt("idAdherent");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                Adherent adherent = new Adherent(id,login,passsword,nom,prenom);

                rs.close();
                return adherent;
            }
            else {
                return null;
            }

        } catch (SQLException sqle){
            sqle.printStackTrace();
            return null;
        }



    }

}


