package es.quark.tasksdemo.repository;

import es.quark.tasksdemo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {



}
