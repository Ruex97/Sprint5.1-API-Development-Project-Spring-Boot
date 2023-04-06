package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class ErrorDto {
    private String message;
    private ZonedDateTime zonedDateTime;

}
