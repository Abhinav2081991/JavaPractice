import java.sql.*;

public class JDBCConnection {



    public static void main (String args[]) throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbcdriver.OracleDriver");
        Connection con = DriverManager
                .getConnection("jdbc:oracle:thin:@ DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=ofss-mum-2481.snbomprshared1.gbucdsint02bom.oraclevcn.com) (PORT=1521))(CONNECT_DATA= (SERVICE_NAME=fccmdb)))","ECM_ATOM807", "password");

        Statement st  = con.createStatement();
        ResultSet rs = st.executeQuery("select * from fcc_cust");

        PreparedStatement ps = con.prepareStatement("update table set col1 = ?, col2 = ? where col3 = ?");
        ps.setString(1, "Abh");
        ps.setString(2, "Abh1");
        ps.setString(3, "Abh2");
        ps.executeUpdate();

        ResultSet rs1 = ps.executeQuery();
        while(rs1.next()){
            System.out.println(rs1.getString(1));
        }


        while(rs.next()){
            rs.getString(0);
//            rs.getInt();
        }



    }





}
