package lesson24.springcore.bean;

import java.util.List;
import java.util.Objects;

public class Item {
	
	private Integer id;
	private String name;
	private List<String> providers;
	private ItemGroup group;
	
	public Item() {
	}

	public Item(Integer id, String name, List<String> providers, ItemGroup group) {
		this.id = id;
		this.name = name;
		this.providers = providers;
		this.group = group;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getProviders() {
		return providers;
	}

	public void setProviders(List<String> providers) {
		this.providers = providers;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item that)) {
			return false;
		}
		
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", providers=" + providers + ", group=" + group + "]";
	}
}
