package com.wanted.preonboarding.ticket.domain.entity;

import com.wanted.preonboarding.ticket.domain.dto.ReserveInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(columnDefinition = "BINARY(16)", nullable = false, name = "performance_id")
    private UUID performanceId;

    @Column(nullable = false, name = "name")
    private String userName;

    @Column(nullable = false, name = "phone_number")
    private String userPhoneNumber;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int gate;

    @Column(nullable = false)
    private char line;

    @Column(nullable = false)
    private int seat;

    @Column(nullable = false)
    private String isCancelled;

    public static Reservation of(ReserveInfo info) {
        return Reservation.builder()
            .performanceId(info.getPerformanceId())
            .userName(info.getReservationName())
            .userPhoneNumber(info.getReservationPhoneNumber())
            .round(info.getRound())
            .gate(1)
            .line(info.getLine())
            .seat(info.getSeat())
            .isCancelled(info.getIsCancelled())
            .build();
    }

}
