package es.quark.tasksdemo.service;

import es.quark.tasksdemo.domain.Task;
import org.springframework.stereotype.Service;


public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);



}
