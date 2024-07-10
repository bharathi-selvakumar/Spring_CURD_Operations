package Task;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ekart")
public class REST_E_KART {
    private List<E_kart> list= new ArrayList<>();

    @PostConstruct
    public void data(){
        list.add(new E_kart(420,"bharathi","mobile","EMP",6374461714L,15000,"transit","jack"));
        list.add(new E_kart(560,"barani","laptop","singipuram",9242424234L,40000,"transit","jack"));
        list.add(new E_kart(520,"anandh","graphic card","dharmapuri",6347443414L,9100,"transit","jon "));
        list.add(new E_kart(450,"aadhi","mobile","dharmapuri",944234744L,20000,"transit","jon "));
        list.add(new E_kart(440,"aasha","dress","belur",9984446176L,599,"transit","jack"));
        list.add(new E_kart(507,"lokesh","tab","krishnagiri",7823461714L,17999,"transit","steve"));
    }


    @GetMapping("/get")
    public List<E_kart> get_data(){
        return list;
    }

    @PostMapping("/post")
    public E_kart create(@RequestBody E_kart new_data){
        list.add(new_data);
        return new_data ;
    }

    @PutMapping("/update")
    public String Update(@RequestBody E_kart update_status){
        boolean update=false;
       for(int i=0;i<list.size();i++){
           if(list.get(i).getParcelId()==update_status.getParcelId()){
               list.get(i).setItemStatus(update_status.getItemStatus());
               System.out.println(list.get(i).getParcelId());
               update=true;
               break;
           }
       }
       if(update==true){
           return "Iterm_status "+update_status.getItemStatus()+"is updated";
       }
       else {
           return "The parceID"+update_status.getParcelId()+" is not in the list";
       }
    }

    @GetMapping("/get/{executive}")
    public List<E_kart> executive(@PathVariable("executive") String executive) {
        List<E_kart> list_E = list.stream().filter(list -> list.getExecutiveName().equalsIgnoreCase(executive)).collect(Collectors.toList());
        return list_E;
}
    @GetMapping("/get/address/{address}")
    public List<E_kart>  address(@PathVariable("address") String address){
        return list.stream().filter(list -> list.getReceiverAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }

    @GetMapping("/get/rec/{receiver}")
    public List<E_kart>  receiver(@PathVariable("receiver") String receiver){
        return list.stream().filter(list -> list.getReceiverName().equalsIgnoreCase(receiver)).collect(Collectors.toList());
    }
}
