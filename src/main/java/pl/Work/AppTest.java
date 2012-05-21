package pl.Work;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import pl.Work.util.HibernateUtil;
import pl.Work.model.UserData;

public class AppTest extends TestCase {
	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		UserData data = new UserData();
		data.setFullName("FullName1");
		data.setName("Name1");
		session.save(data);
		data = new UserData();
		data.setFullName("FullName2");
		data.setName("Name3");
		session.save(data);
		transaction.commit();

		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
		List output = session.createCriteria(UserData.class).list();
		System.out.println("Size: " + output.size());
		System.out.println("Size: " + output);
		transaction.commit();
	}
}
