package com.wanted.preonboarding.ticket.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Performance extends BaseEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int type;

    @Column(nullable = false, name = "start_date")
    private Date startDate;

    @Column(nullable = false, name = "is_soldout", columnDefinition = "tinyint(1) default 0")
    private boolean isSoldout;

}
