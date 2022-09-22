package br.com.abc.avalidando.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Activity {

    private LocalDateTime creationDate;
    private String activityDescription;
    private AcademicDiscipline discipline;
    
    private LocalDateTime deliveryDate;

    public Activity(LocalDateTime creationDate, String description, AcademicDiscipline discipline) {
        this.creationDate = creationDate;
        this.activityDescription = description;
        this.discipline = discipline;
        
        this.deliveryDate = LocalDateTime.of(discipline.getConclusionDate(), LocalTime.MAX);
    }

    public String getDesciption() {
        return activityDescription;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public AcademicDiscipline getDiscipline() {
        return discipline;
    }

    public Object getDeliveryDate() {
        // TODO Auto-generated method stub
        return null;
    }

}
