package spring_boot_intern;

//controller
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

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
    }
