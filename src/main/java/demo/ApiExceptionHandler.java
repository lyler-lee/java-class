package demo;

import demo.dto.ErrorResponse;
import demo.exception.EquipmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//import demo.exception.EquipmentNotFoundException;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> invalid(
            IllegalArgumentException e) {
        ErrorResponse body = new ErrorResponse(
                "INVALID_INPUT", e.getMessage());
        return ResponseEntity.badRequest().body(body);
    }
    @ExceptionHandler(EquipmentNotFoundException.class)
    public ResponseEntity<ErrorResponse> notFound(
            EquipmentNotFoundException e) {
        ErrorResponse body = new ErrorResponse(
                "EQUIPMENT_NOT_FOUND", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(body);
    }
}
