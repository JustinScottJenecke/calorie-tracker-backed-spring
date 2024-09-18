package io.github.justinscottjenecke.calorietrackerbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Mac;

@RestController
public class ResourceController {

    public record Resource(Integer id, String value) {
    }
    public record Macros(double protein, double fats, double carbohydrates) {
    }
    public record FoodItem(
            Integer id,
            String name,
            Integer energy,
            String unit,
            String category, // enum,
            String serving,
            Macros macros) {
    }

    @GetMapping("/")
    public int apiTest() {
        return 2;
    }

    @GetMapping("test")
    public Resource apiTest2() {
        return new Resource(1, "2");
    }

    @GetMapping("fooditem")
    public FoodItem readFoodItem(){
        return new FoodItem(1, "Oats", 1600, "100-grams", "porridge", "30-grams", new Macros(12.80, 7.80, 60.00));
    }
}
