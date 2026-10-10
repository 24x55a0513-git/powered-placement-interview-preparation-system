package com.placement.placementaisystem.entity;

import java.io.Serializable;
import java.util.Objects;

public class StudentSkillId implements Serializable {

    private Integer student;
    private Integer skill;

    public StudentSkillId() {
    }

    public StudentSkillId(Integer student, Integer skill) {
        this.student = student;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentSkillId)) return false;

        StudentSkillId that = (StudentSkillId) o;

        return Objects.equals(student, that.student)
                && Objects.equals(skill, that.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, skill);
    }
}