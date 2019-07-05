package domain.model.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import domain.model.entities.Order;
import domain.model.repository.OrderRepository;

/**
 *
 * @author Luis Vergara
 */
@Stateless
@LocalBean
public class OrderServiceImpl extends BaseService<Order,String>   implements OrderService {

	
	private OrderRepository<Order, String> orderRepository;

	public OrderServiceImpl() {
	
	}
	
	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Inject
	public OrderServiceImpl(OrderRepository<Order, String> orderRepository) {
		super(orderRepository);
		this.orderRepository = orderRepository;
	}

	

	@Override
	public Collection<Order> getAll(String id) throws Exception {
		return this.orderRepository.getAll(id);

	}

	public Order get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (Order) this.orderRepository.get(id);
	}



	public boolean add(Order entity) throws Exception {
		// TODO Auto-generated method stub
	
		this.orderRepository.add(entity);
		return true;
	}
	

}
