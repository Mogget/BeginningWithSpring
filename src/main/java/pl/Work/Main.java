package pl.Work;

import pl.Work.dao.UserDataDao;
import pl.Work.model.UserData;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-hibernate.xml");
        UserDataDao userDataDao = context.getBean("userDataDao", UserDataDao.class);
        UserData jacek = new UserData();
        jacek.setFirstname("olek");
        jacek.setLastname("inny");
        userDataDao.create(jacek);
	}

}
