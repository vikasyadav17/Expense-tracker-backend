package com.expense.tracker.domain.group;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Group table contains information of the members and the purpose of the group
 * 
 * 
 */
@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Group {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @CreatedDate
    @Column(updatable = false)
    private Date createdAt;

    private List<String> users;

    @Lob
    private String description;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
