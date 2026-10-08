/*
package demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public EquipmentResponse create(EquipmentRequest request) {
        if (request.name() == null || request.name().isBlank()) {
            throw new IllegalArgumentException("장비 이름은 필수입니다. ");
        }
        if (request.quantity() < 0) {
            throw new IllegalArgumentException("수량은 0 이상입니다. ");
        }
        Equipment equipment = repository.save(
                request.name(), request.quantity());
        return EquipmentResponse.from(equipment);

    }
    public List<EquipmentResponse> findAll () {
        List<EquipmentResponse> result = new ArrayList<>();
        for (Equipment equipment : repository.findAll()) {
            result.add(EquipmentResponse.from(equipment));
        }
        return result;
    }
    public EquipmentResponse find(Long id) {
        Equipment equipment = repository.findById(id);
        if (equipment == null) {
            throw new EquipmentNotFoundException(id);
        }
        return EquipmentResponse.from(equipment);
    }
}
*/

package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.domain.Equipment;
import demo.dto.EquipmentCountResponse;
import demo.dto.EquipmentRequest;
import demo.dto.EquipmentResponse;
import demo.exception.EquipmentNotFoundException;
import demo.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public EquipmentResponse create(EquipmentRequest request) {
        Equipment equipment = repository.save(
                request.name(), request.quantity());
        return EquipmentResponse.from(equipment);
    }

    public List<EquipmentResponse> findAll() {
        List<EquipmentResponse> result = new ArrayList<>();
        for (Equipment equipment : repository.findAll()) {
            result.add(EquipmentResponse.from(equipment));
        }
        return result;
    }

    public EquipmentResponse find(Long id) {
        Equipment equipment = repository.findById(id);
        if (equipment == null) {
            throw new EquipmentNotFoundException(id);
        }
        return EquipmentResponse.from(equipment);
    }
    public EquipmentCountResponse count() {
        return new EquipmentCountResponse(repository.count());
    }
}



