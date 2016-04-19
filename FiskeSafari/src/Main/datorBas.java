

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

  
     
      public String sendQueryUserInfo(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + "Username: " + rs.getString("cId") + "\n";
        printing = printing + rs.getString("cName") + "\n";
        //printing = printing + rs.getString("cSex") + "\n";
        printing = printing + rs.getString("cEmail") + "\n";
        


      }

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
      
      public String sendQueryGuideInfo(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + "Username: " + rs.getString("gId") + "\n";
        printing = printing + "Full name: " +  rs.getString("gName") + "\n";
        //printing = printing + rs.getString("cSex") + "\n";
        //printing = printing + "Password: " +rs.getString("gPassword") + "\n";
        


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
        printing = printing + "Safari ID :  "+ rs.getString("sId")  + "\n";
        printing = printing + "Location  :  "+rs.getString("sPlace") + "\n";
        printing = printing + "Safari    :  "+rs.getString("sName")  + "\n";
        printing = printing + "Spots     :  "+rs.getString("sSpotsTaken");
        printing = printing + "/"+rs.getString("sSpotsMax") + "\n";
        printing = printing + "Date      :  "+rs.getString("sDate") + "\n";
        printing = printing + "Guide ID  :  "+rs.getString("gId") + "\n";
        //printing = printing + rs.getString("gName") + "\n";
        printing = printing + "Equipment :  "+rs.getString("sEquipementLeft") + "\n";
        //printing = printing + "nfo: "+rs.getString("gInfo");
        printing = printing + "Info      :  "+rs.getString("cInfo") + "\n";
        printing = printing + "\n" + "\n";
        


      }
                    
                   

         }
         

         catch(SQLException e)

         {
              

         }

    
         return printing;

     }
      
      
      
      public String sendQuerySafariVisaGuide(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + "Safari ID :  "+ rs.getString("sId")  + "\n";
        printing = printing + "Location  :  "+rs.getString("sPlace") + "\n";
        printing = printing + "Safari    :  "+rs.getString("sName")  + "\n";
        printing = printing + "Spots     :  "+rs.getString("sSpotsTaken");
        printing = printing + "/"+rs.getString("sSpotsMax") + "\n";
        printing = printing + "Date      :  "+rs.getString("sDate") + "\n";
        printing = printing + "Guide ID  :  "+rs.getString("gId") + "\n";
       // printing = printing + rs.getString("gName") + "\n";
        printing = printing + "Equipment :  "+rs.getString("sEquipementLeft") + "\n";
        printing = printing + "nfo: "+rs.getString("gInfo");
        //printing = printing + "Info      :  "+rs.getString("cInfo") + "\n";
        printing = printing + "\n" + "\n";
        


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
        printing = printing + rs.getInt(1);


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
          
          public String sendQueryEq(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        
        printing = printing + rs.getString("sEquipementLeft");
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
                   public String sendQuerySpotsTaken(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
          
        printing = printing + rs.getString("sSpotsTaken");

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
              public String sendQueryOwnSafari(String str)

     {

          String printing = "";
         try

         {

              rs = stmnt.executeQuery(str);
                    while(rs.next())
      {
        //printing = printing + rs.getString("aId") + "\n";
        printing = printing + "Safari ID :  "+ rs.getString("sId")  + "\n";
        printing = printing + "Location  :  "+rs.getString("sPlace") + "\n";
        printing = printing + "Safari    :  "+rs.getString("sName")  + "\n";
        //printing = printing + "Spots     :  "+rs.getString("sSpotsTaken");
        //printing = printing + "/"+rs.getString("sSpotsMax") + "\n";
        printing = printing + "Date      :  "+rs.getString("sDate") + "\n";
        //printing = printing + "Guide ID  :  "+rs.getString("gId") + "\n";
       //printing = printing + rs.getString("gName") + "\n";
       //printing = printing + "Equipment :  "+rs.getString("sEquipementLeft") + "\n";
        //printing = printing + "nfo: "+rs.getString("gInfo");
        printing = printing + "Info      :  "+rs.getString("cInfo") + "\n";
        printing = printing + "Accommodation      :  "+rs.getString("pAccommodation") + "\n";
        printing = printing + "Amount      :  "+rs.getString("pAmount") + "\n";
        printing = printing + "Equipment booked      :  "+rs.getString("pEquipment") + "\n";
        


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