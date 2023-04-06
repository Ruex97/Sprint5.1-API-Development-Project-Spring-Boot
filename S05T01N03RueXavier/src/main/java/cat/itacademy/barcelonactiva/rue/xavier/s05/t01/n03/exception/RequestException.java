package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.exception;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class RequestException extends RuntimeException{


    public RequestException(String message) {
        super(message);
    }


}
