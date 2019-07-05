package domain.model.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author lvergara
 *
 */
@Entity
public class Order extends BaseEntity<String> implements Serializable {

	@Id
	private String id;

	private String type;
	private String beanOrigin;

	public Order() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBeanOrigin() {
		return beanOrigin;
	}

	public void setBeanOrigin(String beanOrigin) {
		this.beanOrigin = beanOrigin;
	}

	// Getter/Setters omitted for brevity
}