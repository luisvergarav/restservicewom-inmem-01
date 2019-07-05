package domain.model.service;



import java.util.Collection;
import domain.model.entities.Order;



/**
 *
 * @author Luis Vergara
 */
public interface OrderService {

	
	public Collection<Order> getAll(String id) throws Exception;
}
