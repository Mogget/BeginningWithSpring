package pl.Work.dao;

import pl.Work.model.UserData;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDataDaoImpl extends HibernateDaoSupport implements UserDateDao {

	@Override
	@Transactional
	public void create(UserData userData) {
		getHibernateTemplate().save(userData);
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public UserData read(String userDataNr) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	@Transactional(readOnly=true)
	public void update(UserData userData) {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	@Transactional
	public void delete(UserData userData) {
		getHibernateTemplate().update(userData);

	}

}
