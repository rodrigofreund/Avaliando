package br.com.abc.avalidando.model;

import java.time.LocalDateTime;

public class Activity {
    
    private LocalDateTime creationDate;
    private String activityDescription;

    public Activity(LocalDateTime creationDate, String description) {
        this.creationDate = creationDate;
        this.activityDescription = description;
    }

    public String getDesciption() {
        return activityDescription;
    }
    
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

}
