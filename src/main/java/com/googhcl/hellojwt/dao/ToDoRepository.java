package com.googhcl.hellojwt.dao;

import java.util.List;
import com.googhcl.hellojwt.model.Priority;
import com.googhcl.hellojwt.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findByPriority(Priority priority);
}

