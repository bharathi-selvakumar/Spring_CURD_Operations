package spring_boot_intern;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/hack")
public class Hackthon {
    private List<String> Participant_name= new ArrayList<>();

    @PostConstruct
    public void list_of_student(){
        Participant_name.add("bharathi");
        Participant_name.add("barani");
        Participant_name.add("basha");
        Participant_name.add("balaji");
        Participant_name.add("ajay");
        Participant_name.add("lokesh");
    }
    @GetMapping("/name")
    public List<String> get_show_list(){
        System.out.println("the get mapping is working ");
        return Participant_name;
    }
    @GetMapping("/nameById/{index}")
    public String get_name_by_id(@PathVariable("index") int index){
        return Participant_name.get(index);
    }

    @PostMapping("/post")
    public String  post_name(@RequestBody String new_name){
        Participant_name.add(new_name);
        return "The "+new_name+" is Add in list";
    }

    @PutMapping("/put/{name}/{index}")
    public String put_name(@PathVariable("name") String name, @PathVariable("index") int index,@RequestBody String update_name){
          if(name.contains(update_name)){
              return "The you choose that not in the list";
            }
            else {
              Participant_name.add(index,update_name);
              return "The name "+name+" is updated in ";
            }
    }

    @DeleteMapping("/delete/{name}")
    public String delete_name(@PathVariable("name") String name){
        if(Participant_name.contains(name)){
            Participant_name.remove(name);
            return "The name "+name+" is removed in the list ";
        }
        else {
            return "The you choose that not in the list";

        }
    }
}
