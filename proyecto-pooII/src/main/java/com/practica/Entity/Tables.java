package com.practica.Entity;

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
@Table(name = "TABLES")
public class Tables {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TABLE_ID", nullable = false)
    private Integer id;

    @Column(name = "NUM_TABLES", nullable = false)
    private Integer numTables;
    
    @Column(name = "ABILITY", nullable = false)
    private Integer ability;
    
    @OneToOne
    @JoinColumn(name = "STATE_ID", nullable = false, foreignKey = @ForeignKey(name = "STATE-FKT"))
    private State state;
    


}
