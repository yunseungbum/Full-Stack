package com.korea.products.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

	
	private int orderId;         
	    private Long productId;		
	    private String productName;  
	    private int productCount;    
	    private int productPrice;   
	    private int totalPrice;     
	    private LocalDateTime orderDate;
	    
	    
	    public static List<OrderDTO> toListOrderDTO(List<Object[]> list) {
	    	//object[] 데이터를 OrderDTO로 변환
	    	 return list.stream().map(result -> OrderDTO.builder()
	                         .orderId(((int) result[0])) // orderId
	                         .productName((String) result[1]) // productName
	                         .productCount(((int) result[2]))// productCount
	                         .productPrice(((int) result[3]))// productPrice
	                         .totalPrice(((int) result[4])) // totalPrice
	                         .orderDate(((LocalDateTime) result[5]))// orderDate 변환
	                         .build()).collect(Collectors.toList());
	    }
	    
	    
	    
	    
	    
	    
}






























