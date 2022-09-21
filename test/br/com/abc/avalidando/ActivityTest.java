package br.com.abc.avalidando;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import br.com.abc.avalidando.model.Activity;

public class ActivityTest {

    @Test
    public void creatingActivity() {
        String description = "Activity details";
        LocalDateTime creationDateTime = LocalDateTime.now();

        Activity activity = new Activity(creationDateTime, description);

        assertEquals(description, activity.getDesciption());
        assertEquals(creationDateTime, activity.getCreationDate());
    }
}
