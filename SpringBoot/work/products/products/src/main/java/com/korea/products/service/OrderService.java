package com.korea.products.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.products.dto.OrderDTO;
import com.korea.products.dto.ProductDTO;
import com.korea.products.model.OrderEntity;
import com.korea.products.model.ProductEntity;
import com.korea.products.persistence.OrderRepository;
import com.korea.products.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

		private final OrderRepository orderRepository;
		
		@Autowired
		   private ProductRepository productRepository;
		
		//전체조회하기
		//한건의 데이터 -> 하나의 엔티티 객체
		//2개 이상의 데이터가 조회될 수도 있음
		//하나의 메서드는 하나의 값만 반환될 수가 있다.
	    public List<OrderDTO> getAllOrderTotalPrices() {
	    	
	    	//DB에 접근해서 데이터를 조회
	       List<Object[]> list = orderRepository.findAllOderTotalPrices();
	        
	       return OrderDTO.toListOrderDTO(list);
	    
	    }
	    
	    public List<ProductDTO> save(OrderDTO dto){
	    	
	    	//상품 존재 여부를 확인
	    	Optional<ProductEntity> option = productRepository.findById(dto.getProductId()+1);
	    	ProductEntity productEntity;
	        if (option.isPresent()) {
	            productEntity = option.get();
	        }else {
	        	 //IllegalArgumentException: 잘못된 또는 부적절한 인수가 메서드에 전달 됐을 때 발생하는 예외
	        	throw new IllegalArgumentException("상품 없음");
	        }
	        
	        //재고 확인
	        if (productEntity.getStock() < dto.getProductCount()) {
	            throw new RuntimeException("재고가 부족합니다. 현재 재고: " + productEntity.getStock());
	        }
	        
	        //주문하기
	        OrderEntity order = OrderEntity.builder()
	        								.product(productEntity)
	        								.productCount(dto.getProductCount())
	        								.build();
	        
	        //DB에 주문내역 저장하기
	        orderRepository.save(order);	        
	        
	        
	        //재고 감소
	        productEntity.setStock(productEntity.getStock() - dto.getProductCount());
	        productRepository.save(productEntity);
	        
	        List<ProductDTO> dtos = productRepository.findAll().stream()
	        										.map(entity -> new ProductDTO(entity))
	        										.collect(Collectors.toList());
	        
	        return dtos;
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       
	    }//save end
}

	        
	        
	  
		


