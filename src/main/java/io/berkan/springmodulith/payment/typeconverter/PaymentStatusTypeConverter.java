package io.berkan.springmodulith.payment.typeconverter;

import io.berkan.springmodulith.payment.type.PaymentStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PaymentStatusTypeConverter implements AttributeConverter<PaymentStatus, String> {

    @Override
    public String convertToDatabaseColumn(PaymentStatus status) {
        return status.getCode();
    }

    @Override
    public PaymentStatus convertToEntityAttribute(String code) {
        return PaymentStatus.fromCode(code);
    }
}
