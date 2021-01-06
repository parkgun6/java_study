package org.store.domain;


public class DeliveryStore extends Store {

	private boolean delivery;

	public DeliveryStore(String name,double lat,double lng, boolean delivery) {
		super(name, lat, lng);
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "DeliveryStore [delivery=" + super.toString();
	}
}
