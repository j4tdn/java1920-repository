package lesson24.springcore.dao;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(SCOPE_SINGLETON)
public class ItemDaoImpl implements ItemDao{
	
	@Override
	public Set<Integer> getAll() {
		return IntStream.rangeClosed(5, 50)
				.filter(number -> number % 5 == 0)
				.boxed()
				.collect(Collectors.toSet());
	}
	
}
