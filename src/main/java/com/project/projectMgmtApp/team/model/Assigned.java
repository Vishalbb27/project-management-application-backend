package com.project.projectMgmtApp.team.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Assigned {
    @Id
    private int id;
    private int employee_id;
    private int role_id ;
    private Team team_id;

    public Assigned() {
    }

    public Assigned(int id, int employee_id, int role_id, Team team_id) {
        this.id = id;
        this.employee_id = employee_id;
        this.role_id = role_id;
        this.team_id = team_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Team team_id) {
        this.team_id = team_id;
    }
}