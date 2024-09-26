package com.example.demo.dto;

import com.example.demo.model.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {

	//DTO에는 userId가 없다.
	//userId는 어플리케이션과 DB에서 사용자를 구별하기 위한
	//고유 식별자로 사용하기 때문에 숨길 수 있으면 숨기는 것이 좋다.
	private String id;
	private String title;
	private boolean done;
	
	public TodoDTO(final TodoEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	
}
