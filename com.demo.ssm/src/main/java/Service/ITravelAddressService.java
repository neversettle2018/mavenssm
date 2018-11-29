package Service;

import Entity.User;

public interface ITravelAddressService {
    User findUserById(Integer id) throws Exception;
}
