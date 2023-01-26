package com.dev.todoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dev.todoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long>{

}
