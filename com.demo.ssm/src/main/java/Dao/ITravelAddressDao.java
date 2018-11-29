package Dao;

import Entity.User;

public interface ITravelAddressDao {

     User findUserById(Integer id) throws Exception;
}
