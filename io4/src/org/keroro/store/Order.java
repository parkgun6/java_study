package org.keroro.store;

import java.util.List;

import lombok.Data;

@Data
public class Order {

	List<OrderItem> item;

}
