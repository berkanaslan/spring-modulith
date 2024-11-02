package io.berkan.springmodulith.payment.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentStatus {
    PENDING("PG"),
    PAID("PD"),
    CANCELLED("C");

    private final String code;

    public static PaymentStatus fromCode(String code) {
        for (PaymentStatus status : PaymentStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }

        // TODO: throw a custom exception
        throw new IllegalArgumentException("Unknown status code: " + code);
    }
}
