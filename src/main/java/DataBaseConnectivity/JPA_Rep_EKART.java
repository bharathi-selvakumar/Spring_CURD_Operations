package DataBaseConnectivity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPA_Rep_EKART extends JpaRepository<Ekart_Entity,Integer> {
    List<Ekart_Entity> findAllByExecutiveName(String executiveName);
    List<Ekart_Entity> findAllBydAddress(String receiverAddress);
    List<Ekart_Entity> findAllByreceiver(String receiverName);
}