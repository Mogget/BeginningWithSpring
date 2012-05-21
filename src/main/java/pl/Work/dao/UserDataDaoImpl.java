package pl.Work.dao;

import java.util.List;

import javax.annotation.Resource;

import pl.Work.model.UserData;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

//import org.springframework.transaction.annotation.Transactional;
@Repository("userDataDao")
public class UserDataDaoImpl implements UserDataDao {
	protected static Logger logger = Logger.getLogger("dao");
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void create(UserData userData) {
		sessionFactory.getCurrentSession().save(userData);
		// TODO Auto-generated method stub

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
		return sessionFactory.getCurrentSession().createQuery("from userData").list();
	}

}
