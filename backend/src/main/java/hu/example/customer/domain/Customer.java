package hu.example.customer.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;


@Entity
@Table(name = "customer")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_number", nullable = false, updatable = false)
    private String customerNumber;
    @Column(nullable = false) private String name;
    @Column(name = "mothers_name", nullable = false) private String mothersName;
    @Column(name = "birth_place", nullable = false) private String birthPlace;
    @Column(name = "birth_date", nullable = false) private LocalDate birthDate;
    @Embedded private Address address;
    private String interests;
    private String notes;
    private String email;
    private String phone;
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "tax_id") private String taxId;
    @Enumerated(EnumType.STRING) private CustomerStatus status = CustomerStatus.ACTIVE;
    @Enumerated(EnumType.STRING) @Column(name = "kyc_status")
    private KycStatus kycStatus = KycStatus.PENDING;
    @CreationTimestamp @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;
    @UpdateTimestamp @Column(name = "updated_at")
    private OffsetDateTime updatedAt;
    @Version private Long version;
    // publikus no-arg konstruktor (a service használja), getterek, setterek
}
