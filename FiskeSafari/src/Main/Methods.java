/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Jack
 */
public class Methods {
datorBas a = new datorBas();

// Login
public String getAdminUsername(String myAccount){
a.DBHandler();
String query = a.sendQueryUsernameAdmin("select aId from admin where aId ='" + myAccount + "'");
return query;
}

public String getGuideUsername(String myAccount){
a.DBHandler();
String query = a.sendQueryUsernameGuide("select gId from guide where gId ='" + myAccount + "'");
return query;
}

public String getCustomerUsername(String myAccount){
a.DBHandler();
String query = a.sendQueryUsernameCustomer("select cId from custumer where cId ='" + myAccount + "'");
return query;
}

public String getAdminPassword(String myAccount){
a.DBHandler();
String query = a.sendQueryPasswordAdmin("select aPassword from admin where aId ='" + myAccount + "'");
return query;
}

public String getGuidePassword(String myAccount){
a.DBHandler();
String query = a.sendQueryPasswordGuide("select gPassword from guide where gId ='" + myAccount + "'");
return query;
}

public String getCustomerPassword(String myAccount){
a.DBHandler();
String query = a.sendQueryPasswordCustomer("select cPassword from custumer where cId ='" + myAccount + "'");
return query;
}



// Create User
public void createUser(String personNr, String name, String gender, String email, String password){
a.DBHandler();
a.sendQuery("INSERT INTO custumer VALUES " + "('" + personNr + "', '" + name + "', '" + gender + "' , '" + email + "' , '" + password + "'" + ")");
}


// Safari Stor
public int getSIdMax(){
a.DBHandler();
int query = a.sendQueryMax("select max(sId) from safari");
return query;
}

public void createSafari(int sIdmax, String safariName, String sea, int spotsMax, String date, int gId, int spotsTaken, int equipLeft2, String gInfo, String cInfo){
a.DBHandler();
a.sendQuery("INSERT INTO safari VALUES " + "('" + sIdmax + "', '" + safariName + "', '" + sea + "', '" + spotsMax + "' , '" + date + "', '" + gId + "' , '" + spotsTaken + "' , '" + equipLeft2 + "' , '" + gInfo + "' , '" + cInfo + "'" + ")");
}

//Window Customer
public String safariInfo(){
a.DBHandler();
String query = a.sendQuerySafariVisa("select * from safari where sSpotsTaken != 15");
return query;
}

public String userInfo(String accountName){
a.DBHandler();
String query = a.sendQueryUserInfo("select * from custumer where cId =" + "'" +  accountName + "'");
return query;
}

public String getYourSafaris(String accountName){
a.DBHandler();
String query = a.sendQueryOwnSafari("select * from safari, participant where safari.sId = participant.sId and participant.cId =" + "'" + accountName + "'");
return query;
}

public String getCurrentEquipementLeft(String sId){
a.DBHandler();
String query = a.sendQueryEq("select sEquipementLeft from safari where sId =" + "'" + sId + "'");
return query;
}

public String getCurrentTakenSpots(String sId){
a.DBHandler();
String query = a.sendQuerySpotsTaken("select sSpotsTaken from safari where sId =" + "'" + sId + "'");
return query;
}

public void setParticipant(String accountName, String sId, String sleep, String part4, int equipment2, boolean hasPaid){
a.DBHandler();
a.sendQuery("INSERT INTO participant VALUES " + "('" + accountName + "', '" + sId + "', '" + sleep + "', '" + part4 + "' , '" + equipment2 + "', '" + hasPaid + "'" + ")");
}

public void setSpotsTaken(String totalSpots2,String sId){
a.DBHandler();
a.sendQuery("update safari set sSpotsTaken = '" + totalSpots2 +  "' where sId = " + "'" + sId + "'");
}

public void setEquipmentLeft(String totaleq2,String sId){
a.DBHandler();
a.sendQuery("update safari set sEquipementLeft  = '" + totaleq2 +  "' where sId = " + "'" + sId + "'");
}

public String getTakenSpots(String sId){
a.DBHandler();
String query = a.sendQuerySpotsTaken("select sSpotsTaken from safari where sId =" + "'" + sId + "'");
return query;
}

public String getSafariInfo(){
a.DBHandler();
String query = a.sendQuerySafariVisa("select * from safari where sSpotsTaken != 15");
return query;
}

public String getBookings(){
a.DBHandler();
String query = a.sendQueryUserInfo("select * from participants");
return query;
}

/*   FINNS PÅ ANNAT STÄLLE
public String getYourSafaris(String accountName){
a.DBHandler();
String query = a.sendQueryOwnSafari("select * from safari, participant where safari.sId = participant.sId and participant.cId =" + "'" + accountName + "'");
return query;
}
*/

public void deleteBooking(String accountName, String avbokId){
a.DBHandler();
//spots taken
int parti = a.sendQueryAmount("select pAmount from participant where cId =" + "'" + accountName + "'" + "and sId=" + "'" + avbokId + "'");
String spots = a.sendQuerySpotsTaken("select sSpotsTaken from safari where sId=" + "'" + avbokId + "'");
int spots2 = Integer.parseInt(spots);
int parti2 = spots2 - parti;
// EQ
String EqBooked = a.sendQueryEq("select pEquipment from participant where cId =" + "'" + accountName + "'" + "and sId=" + "'" + avbokId + "'");
int EqBooked2 = Integer.parseInt(EqBooked);
String Eq       = a.sendQueryEq("select sEquipementLeft from safari where sId=" + "'" + avbokId + "'");
int Eq2 = Integer.parseInt(Eq);
int EqResult = EqBooked2 + Eq2;

a.sendQuery("update safari set sEquipementLeft =" + "'" + EqResult + "'" + "where sId =" + "'" + avbokId + "'");
a.sendQuery("update safari set sspotsTaken =" + "'" + parti2 + "'" + "where sId =" + "'" + avbokId + "'");
a.sendQuery("delete from participant where cId =" + "'" + accountName + "'" + "and sId=" + "'" + avbokId + "'");
}

//Guide
public String getGuideSafaris(String accountName){
a.DBHandler();
String query = a.sendQuerySafariVisaGuide("select * from safari where gid ='" + accountName + "'");   
return query;
}
public String getGuideInfo(String accountName){
a.DBHandler();
String query = a.sendQueryGuideInfo("select * from guide where gid ='" + accountName + "'");     
return query;
}

public String getMoney() {
a.DBHandler();
String query = a.sendQueryBank("select bName,saldo from bank");
return query;

}

public String getResult() {
a.DBHandler();
String query = a.sendQueryBank2("select sum (saldo) from bank");
return query;

}

public void setMoneyFiskekort(String accountName) {
a.DBHandler();

a.sendQuery("update custumer set fiskekort = false where sId=" + "'" + accountName + "'");
int saldoNow = a.sendQueryGetSaldo("select saldo from bank where bId = 6");
System.out.println(saldoNow);
a.sendQuery("update bank set saldo = 100 where bId = 6");
}


}//Stäng