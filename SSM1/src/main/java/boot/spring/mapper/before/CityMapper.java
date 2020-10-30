package boot.spring.mapper.before;

import boot.spring.po.before.City;
import boot.spring.po.before.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface CityMapper {
	List<City> getCitys();
	List<City> getCountrycity(String countryname);//获取某国家城市列表
	Country getCitysbyCountry(String countryname);
	List<City> selectCitysByName(List<Integer> countryIds);
}
