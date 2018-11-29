package Web;

import Entity.User;
import Service.ITravelAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TravelAddressController {
    @Autowired
    private ITravelAddressService iTravelAddressService;

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id) throws Exception {
        System.out.println("11111111111111");
        return iTravelAddressService.findUserById(id);
    }
}
