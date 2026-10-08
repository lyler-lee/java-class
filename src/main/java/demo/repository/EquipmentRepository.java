package demo.repository;

import demo.domain.Equipment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EquipmentRepository {
    // 수업과 실습 모두 Repository에서 장비의 저장과 조회를 담당합니다.
    // 이번 주는 JPA나 DB가 아닙니다. 재시작 시 데이터가 사라집니다.
    private final Map<Long, Equipment> equipmentMap
            = new LinkedHashMap<>();
    private long sequence = 0;
    public Equipment save(String name, int quantity) {
        Equipment equipment = new Equipment(++sequence, name, quantity);
        equipmentMap.put(equipment.getId(), equipment);
        return equipment;
    }
    public List<Equipment> findAll() {
        return new ArrayList<>(equipmentMap.values());
    }
    public Equipment findById(Long id) {
        return equipmentMap.get(id);
    }
    public int count() { return equipmentMap.size(); }
}
