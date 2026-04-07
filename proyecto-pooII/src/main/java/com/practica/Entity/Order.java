package com.practica.Entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ORDERS")
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Integer id;
    
    @Column(name = "DATE", nullable = false, length = 200)
    private LocalDate date;
    
    @OneToOne
    @JoinColumn(name = "TABLE_ID", nullable = false, foreignKey = @ForeignKey(name = "TABLE_FK"))
    private Tables table ;
    
    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false, foreignKey = @ForeignKey(name = "USER_FK"))
    private User user;
    
    @OneToOne
    @JoinColumn(name = "STATE_ID", nullable = false, foreignKey = @ForeignKey(name = "STATE_FK_ORDER"))
    private State state;

}
