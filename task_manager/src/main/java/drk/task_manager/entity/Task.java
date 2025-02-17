package drk.task_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Table(name = "task")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "title cannot be blank")
    @NotNull(message = "title cannot be null")
    @Max(value = 256, message = "Max value is 256 characters")
    private String title;

    @NotBlank(message = "description cannot be blank")
    @NotNull(message = "description cannot be null")
    @Max(value = 256, message = "Max value is 256 characters")
    private String description;

    @NotNull(message = "completed cannot be null")
    private Boolean completed;

    @NotNull(message = "dueDate cannot be null")
    private LocalDate dueDate;
}
