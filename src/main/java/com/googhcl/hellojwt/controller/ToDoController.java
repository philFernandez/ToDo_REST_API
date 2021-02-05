package com.googhcl.hellojwt.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import com.googhcl.hellojwt.dao.ToDoRepository;
import com.googhcl.hellojwt.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ToDoController {

    @Autowired
    private ToDoRepository repository;


    @GetMapping("/todos")
    Collection<ToDo> todos() {
        return repository.findAll();
    }


    @PostMapping("/todo")
    ResponseEntity<ToDo> createToDo(@RequestBody ToDo todo)
            throws URISyntaxException {
        ToDo newTodo = repository.save(todo);
        return ResponseEntity.created(new URI("/api/todo/" + newTodo.getId()))
                .body(newTodo);
    }
}
    