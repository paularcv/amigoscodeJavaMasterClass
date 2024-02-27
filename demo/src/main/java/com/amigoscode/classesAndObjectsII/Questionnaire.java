package com.amigoscode.classesAndObjectsII;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Questionnaire {

    private int id;
    private Date createdAt;
    private List<Question> questions;

    public Questionnaire(int id) {
        this.id = id;
        this.createdAt = new Date();
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    List<Question> getQuestions() {
        return questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
