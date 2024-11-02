package io.berkan.springmodulith.order.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {
    OPEN("O"),
    IN_PROGRESS("P"),
    COMPLETED("C"),
    CANCELLED("X");

    private final String code;

    public static OrderStatus fromCode(String code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }

        // TODO: throw a custom exception
        throw new IllegalArgumentException("Unknown status code: " + code);
    }
}
