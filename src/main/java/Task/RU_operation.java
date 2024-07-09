package Task;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

@RestController
public class RU_operation {

     int[] balance = {10_000, 8000, 9000, 5000, 4000, 7000, 3000, 6000, 2000, 2000};
    @GetMapping("/balance")
    public int[] all_coustomer_balance() {
        System.out.println("The get method is working");
        return balance;
    }

    @GetMapping("/bal/{index}")
    public int getbalance(@PathVariable("index") int index){
        return balance[index];
    }


    @PutMapping("/update/{position}")
    public String  Check_coustomer(@PathVariable("position") int position) {

                if (balance[position] < 10000 && balance[position] >= 5000) {
                    System.out.println("Bank balance :" + Arrays.toString(balance));
                    float persentage = (float) 3 / 100;
                    System.out.println(persentage);
                    float cal = (balance[position] * persentage);
                    System.out.println(cal);
                    balance[position] = balance[position] - (int) cal;
                    System.out.println("the position " + position + " is updated,where it have the amount of below 10000 " + "[" + balance[position] + "]");
                } else if (balance[position] < 5000 && balance[position] >= 1000) {
                    System.out.println("Bank balance :" + Arrays.toString(balance));
                    float persentage = (float) 5 / 100;
                    System.out.println(persentage);
                    float cal = (balance[position] * persentage);
                    System.out.println(cal);
                    balance[position] = balance[position] - (int) cal;
                    System.out.println("the position " + position + " is updated is updated,where it have the amount of below 5000 :" + "[" + balance[position] + "]");
                } else {
                    return "The index values that you choose,That have amount greater than 10,000 ";
                }
        return "update operation is success";
    }
}