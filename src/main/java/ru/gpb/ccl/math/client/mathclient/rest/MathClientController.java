package ru.gpb.ccl.math.client.mathclient.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.gpb.ccl.math.client.mathclient.dto.OperationRequestDTO;

@Slf4j
@RestController
@RequestMapping("/api/mathclient")
public class MathClientController {

    private final RestTemplate restTemplate;

    @Value("${calculator-service.url}")
    private String calculatorServiceUrl;

    public MathClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sum")
    public Double sum(@RequestParam double a, @RequestParam double b) {
        String url = calculatorServiceUrl + "/sum";
        OperationRequestDTO request = new OperationRequestDTO(a, b);
        log.info("Calling sum operation: {} + {}", a, b);
        return restTemplate.postForObject(url, request, Double.class);
    }

    @GetMapping("/subtract")
    public Double subtract(@RequestParam double a, @RequestParam double b) {
        String url = calculatorServiceUrl + "/subtract";
        OperationRequestDTO request = new OperationRequestDTO(a, b);
        log.info("Calling subtract operation: {} - {}", a, b);
        return restTemplate.postForObject(url, request, Double.class);
    }

    @GetMapping("/multiply")
    public Double multiply(@RequestParam double a, @RequestParam double b) {
        String url = calculatorServiceUrl + "/multiply";
        OperationRequestDTO request = new OperationRequestDTO(a, b);
        log.info("Calling multiply operation: {} * {}", a, b);
        return restTemplate.postForObject(url, request, Double.class);
    }

    @GetMapping("/divide")
    public Double divide(@RequestParam double a, @RequestParam double b) {
        String url = calculatorServiceUrl + "/divide";
        OperationRequestDTO request = new OperationRequestDTO(a, b);
        log.info("Calling divide operation: {} / {}", a, b);
        return restTemplate.postForObject(url, request, Double.class);
    }
}

