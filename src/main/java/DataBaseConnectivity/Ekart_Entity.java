package DataBaseConnectivity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Ekart_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private int  receiverContact;
    private int itemPrice;
    private  String itemStatus;
    private  String  executiveName;
}
