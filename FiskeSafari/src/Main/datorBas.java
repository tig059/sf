

import java.sql.*;


public class datorBas { 
     Connection conn = null; 

     Statement stmnt = null;

     ResultSet rs = null;



     public void DBHandler()    

     {

         try

         {

              Class.forName("org.sqlite.JDBC");

              String url = "jdbc:sqlite:sfdb.db";

              conn=DriverManager.getConnection(url);

              stmnt = conn.createStatement();

              System.out.println("Database connection etablished!"); 
         }

         catch(ClassNotFoundException e)

         {

              e.printStackTrace(System.err);

              String message = e.getMessage();

              message = "No Driver Found: " + message;

              System.out.println(message);

         }

         catch(SQLException e)

         {

              System.out.println(e.getMessage());

         }

     }

  
     
      public String sendQuerySafari(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("sId");
        printing = printing + rs.getString("sName");
        printing = printing + rs.getString("sPlace");
        printing = printing + rs.getString("sSpotsMax");
        printing = printing + rs.getString("sDate");
        printing = printing + rs.getString("gId");
        printing = printing + rs.getString("sSpotsTaken");
        printing = printing + rs.getString("sEquipementLeft");
        printing = printing + rs.getString("gInfo");
        printing = printing + rs.getString("cInfo");
        


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
      
      
      public String sendQuerySafariVisa(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("sId")  + "\n";
        printing = printing + rs.getString("sName")  + "\n";
        printing = printing + rs.getString("sPlace") + "\n";
        printing = printing + rs.getString("sSpotsMax") + "\n";
        printing = printing + rs.getString("sDate") + "\n";
        printing = printing + rs.getString("gId") + "\n";
        printing = printing + rs.getString("gName") + "\n";
        printing = printing + rs.getString("sSpotsTaken") + "\n";
        printing = printing + rs.getString("sEquipementLeft") + "\n";
        //printing = printing + rs.getString("gInfo");
        printing = printing + rs.getString("cInfo") + "\n";
        


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
      
      
     public void sendQuery(String str)

     {

         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {


      }

         }
         

         catch(SQLException e)

         {
              

         }


     }
          public String sendQueryUsernameAdmin(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        printing = printing + rs.getString("aId");
        //printing = printing + rs.getString("aPassword") + "\n";


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
               public int sendQueryMax(String str)

     {

          int printing = 0;
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getInt("sId");


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }   
          public String sendQueryPasswordAdmin(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("aPassword");


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
          public String sendQueryPasswordGuide(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("gPassword");


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
          public String sendQueryUsernameGuide(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("gId");
//plingplång

      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
     
          public String sendQueryUsernameCustomer(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("cId");
//plingplång

      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
          public String sendQueryPasswordCustomer(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + rs.getString("cPassword");
//plingplång

      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
                                                   
     public void closeAll()

     {   

         try

         {

              stmnt.close();

              conn.close();

         }

         catch(SQLException e)

         {

              System.out.println(e.getMessage());

         }

     }


}