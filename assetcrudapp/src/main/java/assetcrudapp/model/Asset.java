package assetcrudapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aId;
	private String name;
	private String description;
	private long price;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Asset(int aId, String name, String description, long price) {
		super();
		this.aId = aId;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Asset [aId=" + aId + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	
	
}

