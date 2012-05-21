package pl.Work.dao;

import pl.Work.model.UserData;

public interface UserDateDao {
    public void create(UserData userData);
    public UserData read(String userDataNr);
    public void update(UserData userData);
    public void delete(UserData userData);
}
