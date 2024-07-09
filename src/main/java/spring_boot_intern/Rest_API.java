package spring_boot_intern;

//controller
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class Rest_API {
    private int[] id={10,20,30,40,50};
    @GetMapping("/get")
    public int[] getId() {
        return id;
    }

    @GetMapping("/per/{index}")
    public int getid_per(@PathVariable("index") int index){
       return id[index];
    }

    @DeleteMapping("/del/{index}")
    public int del(@PathVariable("index") int index){
        int[] ide={10,20,30,40,50};
        int response=index;
        int new_=ide[index]= 0;
        System.out.println("the value"+Arrays.toString(ide));
        return response;
    }

//    private List<String> newlist= new ArrayList<>();
//    @PostConstruct
//    public void new_list(){
//        newlist.add("bharathi");
//        newlist.add("eviljack");
//        newlist.add("barani");
//        newlist.add("devilcrime");
//        newlist.add("lokesh");
//        newlist.add("King_jd");
//    }
//
//    @GetMapping("/list")
//    public List<String> getlist() {
//        return newlist;
//    }
//
//    @GetMapping("/list/{index}")
//    public List<String > getid_list(@PathVariable("index") int index){
//        return newlist.get(index);

    }

