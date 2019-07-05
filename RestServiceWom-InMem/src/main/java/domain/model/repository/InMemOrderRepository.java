package domain.model.repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import domain.model.entities.Order;

/**
 *
 * @author Luis Vergara
 */
@Singleton
@Startup
public class InMemOrderRepository implements OrderRepository<Order, String> {

	private Map<String, Order> coffeeOrders = new ConcurrentHashMap<>();

	@Inject
	Logger logger;

	/**
	 * Initialize
	 * 
	 * @throws Exception
	 */
	public InMemOrderRepository() throws Exception {
	}

	@Override
	public boolean add(Order entity) {
		logger.info("Persisting Order " + entity.getId() + entity.getBeanOrigin());
		coffeeOrders.putIfAbsent(entity.getId(), entity);

		return true;

	}

	
	@Override
	public void remove(String id) {

	}

	@Override
	public void update(Order order) {

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Order> getAll(String id) throws Exception {

		return this.coffeeOrders.values();

	}

	@Override
	public Order get(String id) throws Exception {
		return coffeeOrders.get(id);
	}
}
