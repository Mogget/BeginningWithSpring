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
public class UserDataServiceImpl implements UserDataService {
	protected static Logger logger = Logger.getLogger("service");
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void create(UserData userData) {
		sessionFactory.getCurrentSession().save(userData);
	}
	
	@Override
	public UserData read(String userDataNr) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public void update(UserData userData) {
		sessionFactory.getCurrentSession().update(userData);
	}

	@Override
	public void delete(UserData userData) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserData> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from pl.Work.model.UserData").list();
	}

}
