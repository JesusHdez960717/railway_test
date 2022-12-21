package dev.root101.admin.rest_api.v1;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Yo
 */
@Slf4j
@Tag(name = "TEST Controller", description = "Para probar el servicio")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/test_controller")
public class TestController {

    public record MemoryStatus(long totalMemory, long maxMemory, long freeMemory) {

    }

    @GetMapping("/memory_status")
    public MemoryStatus memory() {
        return new MemoryStatus(
                Runtime.getRuntime().totalMemory() / 1000000,
                Runtime.getRuntime().maxMemory() / 1000000,
                Runtime.getRuntime().freeMemory() / 1000000
        );
    }

    @GetMapping("/hi")
    public String hi() {
        return "Helou world";
    }
}
