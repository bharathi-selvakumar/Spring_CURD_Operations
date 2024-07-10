package Task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class E_kart {
    private int  parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private long  receiverContact;
    private double itemPrice;
    private  String itemStatus;
    private  String  executiveName;
}

