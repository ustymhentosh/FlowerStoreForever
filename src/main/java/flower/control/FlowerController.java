package flower.control;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    
    @GetMapping("/list")
    public List<Flower> getFlowers(){
        return List.of(new Flower(19, FlowerColor.RED, 6.3, FlowerType.CHAMOMILE));
    }

}
