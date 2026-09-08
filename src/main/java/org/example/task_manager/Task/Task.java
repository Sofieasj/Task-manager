package org.example.task_manager.task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // mapper til db (JPA)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db tar seg av id-oppretting
    private Long taskId;
    private String title;
    private String description;
    private boolean completed;

    // no-argument konstruktør. Kreves av JPA
    protected Task() {
    }

    // kun tittel kreves - id settes i db og beskrivelse er valgfritt
    public Task(String title) {
        this.title = title;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
