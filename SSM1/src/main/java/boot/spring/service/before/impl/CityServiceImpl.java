package boot.spring.service.before.impl;

import boot.spring.mapper.before.CityMapper;
import boot.spring.po.before.City;
import boot.spring.po.before.Country;
import boot.spring.service.before.CityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=5)
//@Service
public class CityServiceImpl implements CityService{
//	@Autowired
	  private CityMapper citymapper;
	public List<City> getCitylist() {
		List<City> l=citymapper.getCitys();
		return l;
	}
	public List<City> getpagecitylist(int pagenum, int pagesize) {
		PageHelper.startPage(pagenum,pagesize);
		List<City> l=citymapper.getCitys();
		return l;
	}
	public List<City> getCountryCity(String Countryname) {
		List<City> list=citymapper.getCountrycity(Countryname);
		return list;
	}
	public List<City> getpageCountryCity(String Countryname, int pagenum,
			int pagesize) {
		PageHelper.startPage(pagenum,pagesize);
		List<City> list=citymapper.getCountrycity(Countryname);
		return list;
	}
	public Country getCountryCitys(String Countryname) {
		return citymapper.getCitysbyCountry(Countryname);
	}

}