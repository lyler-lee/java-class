package demo.controller;

import java.util.List;

import demo.dto.EquipmentRequest;
import demo.dto.EquipmentResponse;
import demo.service.EquipmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    private final EquipmentService service;
    public EquipmentController(EquipmentService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EquipmentResponse create(
            @RequestBody EquipmentRequest request) {
        return service.create(request);
    }

    @GetMapping
    public List<EquipmentResponse> findAll() {
            return service.findAll();
    }

    @GetMapping("/{id}")
    public EquipmentResponse find(@PathVariable Long id) {
        return service.find(id);
    }

    /*
    @GetMapping("/count")
    public EquipmentCountResponse count() { return service.count; }
    */
}

