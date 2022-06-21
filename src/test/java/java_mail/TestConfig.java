package java_mail;

public class TestConfig{



public static String server="smtp.gmail.com";
public static String from = "jishamt1@gmail.com";
public static String password = "jisha28nov";
public static String[] to ={"abdsurendhar@gmail.com","rameshmuralee@gmail.com"};
public static String subject = "Reg: Testing Mail";

public static String messageBody ="Hi, Checking whether tha mail is receiving or not.";
public static String attachmentPath="C:\\14091_14 records.csv";
public static String attachmentName="File.jpg";



//SQL DATABASE DETAILS	
public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
public static String dbUserName="sa"; 
public static String dbPassword="$ql$!!1"; 


//MYSQL DATABASE DETAILS
public static String mysqldriver="com.mysql.jdbc.Driver";
public static String mysqluserName = "root";
public static String mysqlpassword = "selenium";
public static String mysqlurl = "jdbc:mysql://localhost:3306/acs";









}



