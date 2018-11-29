package Service.impl;

import Dao.ITravelAddressDao;
import Entity.User;
import Service.ITravelAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITravelAddressServiceImpl implements ITravelAddressService {

    @Autowired
    private ITravelAddressDao iTravelAddressDao;
    public User findUserById(Integer id) throws Exception {
    return iTravelAddressDao.findUserById(id);
    }
}
