package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bucket")
public class Bucket {

	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;

	@Column(name = "puchase_date")
	private Date puchase_date;

	public Bucket() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getPuchase_date() {
		return puchase_date;
	}

	public void setPuchase_date(Date puchase_date) {
		this.puchase_date = puchase_date;
	}

	@Override
	public String toString() {
		return "Bucket [id=" + id + ", user=" + user + ", product=" + product + ", puchase_date=" + puchase_date + "]";
	}

}
