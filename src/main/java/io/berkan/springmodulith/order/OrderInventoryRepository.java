package io.berkan.springmodulith.order;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
 interface OrderInventoryRepository extends CrudRepository<OrderInventory, UUID> {

    @Query("SELECT SUM(totalPrice) FROM OrderInventory WHERE orderId = :orderId")
    long orderIdAmount(UUID orderId);
}
