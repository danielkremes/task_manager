package drk.task_manager.service;

import drk.task_manager.entity.Task;
import drk.task_manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDescription) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("task not found"));
        task.setTitle(taskDescription.getTitle());
        task.setDescription(taskDescription.getDescription());
        task.setCompleted(taskDescription.isCompleted());
        task.setDueDate(taskDescription.getDueDate());
        return task;
    }

    public void removeTask(Long id) {
        taskRepository.deleteById(id);
    }

    public List<Task> getTaskByStatus(boolean completed) {
        return taskRepository.findByCompleted(completed);
    }
}
