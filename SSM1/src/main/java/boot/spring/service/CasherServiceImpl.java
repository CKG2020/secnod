package boot.spring.service;



import boot.spring.mapper.CasherMapper;
import boot.spring.po.Casher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasherServiceImpl {
    @Autowired
    private CasherMapper casherMapper;

    public Casher findUserByNameAndPassword(String username, String password) {
        return casherMapper.findByNumAndPassword(username, password);
    }


}
