package com.placement.placementaisystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "job_skills")
@IdClass(JobSkillId.class)
public class JobSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "minimum_level")
    private Integer minimumLevel;

    public JobSkill() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Integer getMinimumLevel() {
        return minimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel) {
        this.minimumLevel = minimumLevel;
    }
}