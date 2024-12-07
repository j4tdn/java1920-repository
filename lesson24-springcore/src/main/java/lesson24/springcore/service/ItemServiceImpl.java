package lesson24.springcore.service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lesson24.springcore.dao.ItemDao;

@Service
@Scope(SCOPE_SINGLETON)
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public Set<Integer> getAll() {
		return itemDao.getAll();
	}
	
}
