package com.practica.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "ORDERITEM")
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDERITEM_ID", nullable = false)
    private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false, foreignKey = @ForeignKey(name = "ORDER_FK"))
    private Order order ;
    
    @OneToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false, foreignKey = @ForeignKey(name = "PRODUCT_FK"))
    private Product product;
    
    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;
    
    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;
}
