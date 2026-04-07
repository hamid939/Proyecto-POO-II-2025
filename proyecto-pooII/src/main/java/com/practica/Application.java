package com.practica;

import java.time.LocalDate;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica.Entity.Category;
import com.practica.Entity.Order;
import com.practica.Entity.OrderItem;
import com.practica.Entity.Product;
import com.practica.Entity.State;
import com.practica.Entity.Tables;
import com.practica.Entity.User;
import com.practica.Repository.ICategoryRepository;
import com.practica.Repository.IOrderItemRepository;
import com.practica.Repository.IOrderRepository;
import com.practica.Repository.IProductRepository;
import com.practica.Repository.IStateRepository;
import com.practica.Repository.ITablesRepository;
import com.practica.Repository.IUserRepository;

import lombok.RequiredArgsConstructor;


@SpringBootApplication
@RequiredArgsConstructor
public class Application implements CommandLineRunner {
	private final ICategoryRepository categoryRespository;
	private final IUserRepository usuarioRepository;
	private final IStateRepository stateRepository;
	private final ITablesRepository tablesRepository;
	private final IProductRepository productRepository;
	private final IOrderRepository orderRepository;
	private final IOrderItemRepository orderItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		/*tablesRepository.save(
				Tables.builder()
				.numTables(1)
				.ability(5)
				.state(State.builder().id(4).build())
				.build()
				);*/
		/*productRepository.save(
				Product.builder()
				.name("tacos de pollo")
				.price(23.5)
				.category(Category.builder().id(3).build())
				.build()

				);*/
		/*orderRepository.save(
				Order.builder()
				.date(LocalDate.of(1900,4,22))
				.table(Tables.builder().id(2).build())
				.user(User.builder().id(1).build())
				.state(State.builder().id(1).build())
				.build()

				);*/
		orderItemRepository.save(
				OrderItem.builder()
				.order(Order.builder().id(2).build())
				.product(Product.builder().id(1).build())
				.amount(2)
				.description("no crema")
				.build()
				
				
				
				);
		
		
		
		
		
				
				
				
				
		
		


	
	

}   
}
