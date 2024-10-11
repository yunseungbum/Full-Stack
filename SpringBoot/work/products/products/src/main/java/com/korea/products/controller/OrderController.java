package com.korea.products.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.products.dto.OrderDTO;
import com.korea.products.dto.ProductDTO;
import com.korea.products.dto.ResponseDTO;
import com.korea.products.service.OrderService;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService orderService;
	
	@GetMapping("total")
	public ResponseEntity<?> getAllOrderTotals(){
		List<OrderDTO> lsit = orderService.getAllOrderTotalPrices();
		ResponseDTO<OrderDTO> response = ResponseDTO.<OrderDTO>builder().data(lsit).build();
		return ResponseEntity.ok().body(response);
	
	}
	
	  @PostMapping
	    public ResponseEntity<?> saveOrder(@RequestBody OrderDTO dto){
	    	List<ProductDTO> list = orderService.save(dto);
	    	ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(list).build();
	    	return ResponseEntity.ok().body(list);
	    }
	

}
