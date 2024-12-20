package io.berkan.springmodulith.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface InventoryRepository extends JpaRepository<Inventory, UUID> {
    Optional<Inventory> findInventoryByName(String name);
}
