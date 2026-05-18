package com.restaurantapp.restaurant.model;

import java.util.List;

import com.restaurantapp.restaurant.entities.Menu;

public class OrderItems 
{
	private int selectedItemId;
	private List<Menu> menuItems;
	private String userName;
	
	public OrderItems()
	{
		
	}
	
	public OrderItems(List<Menu> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public List<Menu> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<Menu> menuItems) {
		this.menuItems = menuItems;
	}
	
	public int getSelectedItemId() {
        return selectedItemId;
    }

    
    public void setSelectedItemId(int selectedItemId) {
        this.selectedItemId = selectedItemId;
    }

	
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "OrderItems [selectedItemId=" + selectedItemId + ", menuItems=" + menuItems + ", customerId="
				+ userName + "]";
	}

}
