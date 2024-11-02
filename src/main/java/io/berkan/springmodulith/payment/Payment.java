package io.berkan.springmodulith.payment;

import io.berkan.springmodulith.payment.type.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(
        indexes = {
                @Index(name = "payment_status_index", columnList = "status")
        }
)
@Getter
@Setter
@ToString
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID orderId;
    private long amount;
    private Timestamp paymentDate = Timestamp.from(Instant.now());
    private PaymentStatus status = PaymentStatus.PENDING;
}
