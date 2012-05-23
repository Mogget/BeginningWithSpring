package pl.Work.service;

import java.util.List;

import javax.annotation.Resource;

import pl.Work.model.UserData;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDataService")
@Transactional
public class UserDataService {
	protected static Logger logger = Logger.getLogger("service");

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	public void create(UserData userData) {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		// sdf.parse(userData.getDate());
		sessionFactory.getCurrentSession().save(userData);
	}

	public UserData read(String userDataNr) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void update(UserData userData) {
		sessionFactory.getCurrentSession().update(userData);
	}

	public void delete(UserData userData) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@SuppressWarnings("unchecked")
	public List<UserData> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from pl.Work.model.UserData").list();
	}

}
