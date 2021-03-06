package eu.aosoft.club.admin.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Offermann Alexander
 *
 * CREATE TABLE ADDRESS (
 *     ADDRESS_ID 			BIGINT 				NOT NULL,
 * 	   STREET    			VARCHAR2(255) 		NOT NULL,
 * 	   POSTCODE    		    VARCHAR2(10) 		NOT NULL,
 * 	   LOCATION   			VARCHAR2(255) 		NOT NULL,
 * 	   COUNTRY   			VARCHAR2(255) 		NOT NULL,
 * 	   PRIMARY KEY (ADDRESS_ID)
 * );
 *
 */
@Entity
@Table(name = "ADDRESS")
@Data
@Audited
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_generator")
    @SequenceGenerator(name = "address_generator", sequenceName = "address_seq", allocationSize = 1)
    @Column(name = "ADDRESS_ID")
    private Long addressId;

    @Column(name = "STREET", nullable = false, length = 512)
    @NotNull
    private String street;

    @Column(name = "POSTCODE", nullable = false, length = 10)
    @NotNull
    private String postcode;

    @Column(name = "LOCATION", nullable = false, length = 10)
    @NotNull
    private String location;

    @Column(name = "COUNTRY", nullable = false, length = 10)
    @NotNull
    private String country;

}
