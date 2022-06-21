package java_mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Testmail extends Mail{

	public static void main(String[] args) throws AddressException, MessagingException  {
		
		Mail mail = new Mail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);

	}

}
