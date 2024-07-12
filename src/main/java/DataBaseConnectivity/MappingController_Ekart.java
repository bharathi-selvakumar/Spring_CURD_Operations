package DataBaseConnectivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database")
public class MappingController_Ekart {
    @Autowired
    EkartServices services;


    @PostMapping("/post")
    public Ekart_Entity Posting(@RequestBody Ekart_Entity new_data){
        return  services.post(new_data);
    }
    @GetMapping("/get/{executive}")
    public List<Ekart_Entity> getExecutive(@PathVariable("executive") String executive){
        return services.get_excutive(executive);
    }

    @GetMapping("/get/{address}")
    public List<Ekart_Entity> getaddress(@PathVariable("/address") String address){
        return services.get_address(address);
    }

    @GetMapping("/get/{receiver}")
    public List<Ekart_Entity> getreceiver(@PathVariable("/receiver") String receiver){
        return services.get_receiver(receiver);
    }

    @GetMapping("/exe/{exeid}")
    public List<Ekart_Entity> getexe(@PathVariable("exeid") int exeid){
        return services.get_exe(exeid);
    }
}


