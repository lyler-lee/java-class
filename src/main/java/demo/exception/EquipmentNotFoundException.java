package demo.exception;

public class EquipmentNotFoundException extends RuntimeException {
    public EquipmentNotFoundException(Long id) {
        super("해당 장비를 찾을 수 없습니다. id=" + id);
    }
}