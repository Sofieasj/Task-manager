package org.example.task_manager.Task;

public class Task {
    int taskID;
    String title;
    String description;
    String category;

    // kun id, tittel og kategori må settes - beskrivelse kan venter
    public Task(int taskID, String title, String category) {
        this.taskID = taskID;
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // legg inn kontroller på hva som er lov å gi som input (i tillegg til i frontend)
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        // legg inn kontroller - fx mot code injection o.l.
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        // skal kun settes til en av de predefinerte kategoriene - kan på sikt gjøre mer dynamisk ved behov
        if (category.equals("Applied")) { // håndter mer effektivt og ryddig enn dette
            this.category = category;
        }
    }
    // ID skal settes automatisk av databasen og brukeren skal ikke kunne endre, kun hente
    public int getTaskID() {
        return taskID;
    }
}
