package br.com.abc.avalidando;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import br.com.abc.avalidando.model.AcademicDiscipline;
import br.com.abc.avalidando.model.Activity;

public class ActivityTest {

    @Test
    public void createActivityNoDateToDeliver() {
        String description = "Activity details";
        LocalDateTime creationDateTime = LocalDateTime.now();
        AcademicDiscipline discipline = new AcademicDiscipline();

        Activity activity = new Activity(creationDateTime, description, discipline);

        mandatoryValidation(description, creationDateTime, discipline, activity);
        
        assertEquals(discipline.getConclusionDate(),activity.getDeliveryDate());
    }

    private void mandatoryValidation(String description, LocalDateTime creationDateTime, AcademicDiscipline discipline,
            Activity activity) {
        assertEquals(description, activity.getDesciption());
        assertEquals(creationDateTime, activity.getCreationDate());
        assertEquals(discipline, activity.getDiscipline());
    }
}
