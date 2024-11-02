package io.berkan.springmodulith.order.typeconverter;

import io.berkan.springmodulith.order.type.OrderStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class OrderStatusTypeConverter implements AttributeConverter<OrderStatus, String> {

    @Override
    public String convertToDatabaseColumn(OrderStatus status) {
        return status.getCode();
    }

    @Override
    public OrderStatus convertToEntityAttribute(String code) {
        return OrderStatus.fromCode(code);
    }
}
