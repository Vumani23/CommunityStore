package za.ac.cput.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.store.domain.VendorProductListing;

@Repository
public interface VendorProductListingRepository extends JpaRepository<VendorProductListing, Long> {
}
