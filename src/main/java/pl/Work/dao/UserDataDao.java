package pl.Work.dao;

import java.util.List;

import pl.Work.model.UserData;

public interface UserDataDao {
    public void create(UserData userData);
    public UserData read(String userDataNr);
    public List<UserData> getAll();
    public void update(UserData userData);
    public void delete(UserData userData);
}
