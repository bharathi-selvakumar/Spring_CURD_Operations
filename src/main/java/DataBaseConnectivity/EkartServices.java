package DataBaseConnectivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EkartServices {
    @Autowired
    JPA_Rep_EKART jpa;

    public Ekart_Entity post(Ekart_Entity data){
        return jpa.save(data);
    }

    public List<Ekart_Entity> get_excutive(String name){
        return  jpa.findAllByExecutiveName(name);
    }

    public List<Ekart_Entity> get_address(String address){
        return jpa.findAllByReceiverAddress(address);
    }

    public List<Ekart_Entity> get_receiver(String receiver){
        return jpa.findAllByReceiverName(receiver);
    }

    public List<Ekart_Entity> get_exe(int exeid){
        return jpa.findAllByExecutiveID(exeid);
    }




}
