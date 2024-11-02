package io.berkan.springmodulith.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface OrderRepository extends CrudRepository<Order, UUID> {
    Optional<Order> findOrderByOrderIdentifier(UUID orderIdentifier);
}
