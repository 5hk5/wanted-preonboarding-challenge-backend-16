package com.wanted.preonboarding.ticket.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceSeatInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private int performanceId;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int gate;

    @Column(nullable = false)
    private char line;

    @Column(nullable = false)
    private int seat;

    @Column(nullable = false)
    private String isReserved;

    @ManyToOne(fetch = FetchType.LAZY)
    private Performance performance;

}
