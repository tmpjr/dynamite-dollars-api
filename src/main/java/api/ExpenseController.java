package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ExpenseController {
   private static final String template = "Hello, %s";
   private final AtomicLong counter = new AtomicLong();

   @RequestMapping("/expense")
   public Expense expense(@RequestParam(value = "name", defaultValue = "World") String name) {
      return new Expense(counter.incrementAndGet(), String.format(template, name));
   }
}
