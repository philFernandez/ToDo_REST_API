package com.googhcl.hellojwt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ToDo {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String startDate;
    private String endDate;
    private Priority priority;

    public ToDo(String description, String startDate, String endDate,
            Priority priority) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
    }

}


