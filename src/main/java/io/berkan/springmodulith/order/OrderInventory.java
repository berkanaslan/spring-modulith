package io.berkan.springmodulith.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(
        indexes = {
                @Index(name = "order_inventory_order_id_index", columnList = "order_id"),
                @Index(name = "order_inventory_inventory_id_index", columnList = "inventory_id"),
        }
)
@Getter
@Setter
@ToString
public class OrderInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID orderId;
    private UUID inventoryId;
    private int quantity;
    private long totalPrice;
}
