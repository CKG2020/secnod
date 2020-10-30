package boot.spring.service.before.impl;
//
//
//import boot.spring.mapper.before.LoginMapper;
//import boot.spring.po.before.Staff;
//import boot.spring.service.before.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
////@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=5)
////@Service
//public class LoginServiceImpl implements LoginService{
////	@Autowired
//	 private  LoginMapper loginmapper;
//	public String getpwdbyname(String name) {
//		Staff s=loginmapper.getpwdbyname(name);
//		if(s!=null)
//		return s.getPassword();
//		else
//		return null;
//	}
//
//}
