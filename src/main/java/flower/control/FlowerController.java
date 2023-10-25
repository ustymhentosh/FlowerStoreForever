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
    public static final int sepalLength = 115;
    public static final int price = 70;
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(new Flower(
            sepalLength, FlowerColor.RED,
            price, FlowerType.CHAMOMILE));
    }

}
