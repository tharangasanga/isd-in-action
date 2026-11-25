package tacos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tacos.Ingredient.Type;
import tacos.data.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args);
  }

  @Bean
  public CommandLineRunner dataLoader(IngredientRepository repo) {
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP, new java.math.BigDecimal("1.50")));
        repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP, new java.math.BigDecimal("1.50")));
        repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN, new java.math.BigDecimal("1.75")));
        repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN, new java.math.BigDecimal("2.75")));
        repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES, new java.math.BigDecimal("0.75")));
        repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES, new java.math.BigDecimal("0.50")));
        repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE, new java.math.BigDecimal("1.00")));
        repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE, new java.math.BigDecimal("1.00")));
        repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE, new java.math.BigDecimal("1.00")));
        repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE, new java.math.BigDecimal("0.50")));
        repo.save(new Ingredient("WWTO", "Whole Wheat Tortilla", Type.WRAP, new java.math.BigDecimal("0.75")));
        repo.save(new Ingredient("BLCN", "Cola", Type.DRINK, new java.math.BigDecimal("1.25")));
        repo.save(new Ingredient("WATR", "Mineral Water", Type.DRINK, new java.math.BigDecimal("1.00")));
      }
    };
  }
  
}
