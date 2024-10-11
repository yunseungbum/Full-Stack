package com.korea.products.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.korea.products.model.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

	//총 결제금액
	//상품가격 * 주문개수
	@Query("SELECT o.orderId," //상품번호
			+ "o.product.name," //상품이름
			+ "o.productCount," //주문개수
			+ "o.product.price," //상품단가
			+ "(o.productCount * o.product.price) AS totalPrice,"//결제금액
			+ "o.orderDate "//주문날짜
			+ "FROM OrderEntity o")
	List<Object[]> findAllOderTotalPrices();
	
}
