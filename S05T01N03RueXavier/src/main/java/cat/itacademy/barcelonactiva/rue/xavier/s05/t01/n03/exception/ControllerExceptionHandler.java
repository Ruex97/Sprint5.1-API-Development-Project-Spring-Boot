package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.exception;

import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> runtimeExceptionHandler(RuntimeException exception) {
        ErrorDto errorDto = ErrorDto.builder().message(exception.getMessage()).zonedDateTime(ZonedDateTime.now()).build();

        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(RequestException.class)
    public ResponseEntity<ErrorDto> requestExceptionHandler(RequestException exception) {
        ErrorDto errorDto = ErrorDto.builder().message(exception.getMessage()).zonedDateTime(ZonedDateTime.now()).build();

        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(FlowerNotFoundException.class)
    public ResponseEntity<ErrorDto> flowerNotFoundExceptionHandler(FlowerNotFoundException exception) {
        ErrorDto errorDto = ErrorDto.builder().message(exception.getMessage()).zonedDateTime(ZonedDateTime.now()).build();

        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);

    }

}
