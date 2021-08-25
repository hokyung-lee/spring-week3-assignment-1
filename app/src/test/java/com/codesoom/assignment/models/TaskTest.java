package com.codesoom.assignment.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest {

    private static final long ID = 1L;
    private static final String TITLE = "TASK";

    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task(ID, TITLE);
    }

    @Test
    void getId() {
        assertThat(task.getId()).isEqualTo(ID);
    }

    @Test
    void getTitle() {
        assertThat(task.getTitle()).isEqualTo(TITLE);
    }

    @Test
    void setId() {
        assertThat(task.getId()).isEqualTo(ID);

        long expectId = 2L;
        task.setId(expectId);

        assertThat(task.getId()).isEqualTo(expectId);
    }

    @Test
    void setTitle() {
        assertThat(task.getTitle()).isEqualTo(TITLE);

        String expectTitle = "NEW";
        task.setTitle(expectTitle);

        assertThat(task.getTitle()).isEqualTo(expectTitle);
    }

    @Test
    void stringify() {
        assertThat(task.stringify()).isEqualTo("{\"id\":" + ID + ",\"title\":\"" + TITLE + "\"}");
    }
}
