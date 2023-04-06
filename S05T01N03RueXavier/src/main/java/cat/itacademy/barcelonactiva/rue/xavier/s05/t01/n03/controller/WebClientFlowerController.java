package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.controller;


import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.exception.FlowerNotFoundException;
import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.exception.RequestException;
import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.dto.FlowerDto;
import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.service.WebClientFlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@Validated
@RequestMapping("/flowerClient")
public class WebClientFlowerController {


    private final WebClientFlowerService webClientFlowerService;

    @Autowired
    public WebClientFlowerController(WebClientFlowerService webClientFlowerService) {
        this.webClientFlowerService = webClientFlowerService;
    }



    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Flux<FlowerDto>> getAllFlowers() {
        return new ResponseEntity<>(webClientFlowerService.getAllFlowers(), HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Mono<FlowerDto>> getById(@PathVariable int id) throws Exception {
        try {
            return new ResponseEntity<>(webClientFlowerService.getFlowerById(id), HttpStatus.OK);
        } catch (Exception ex) {
            throw new Exception("Internal server error", ex.getCause());
        }

    }

    @PostMapping("/add")
    public ResponseEntity<Mono<FlowerDto>> addFlower(@RequestBody FlowerDto flowerDto){

        if(flowerDto.getName() == null|| flowerDto.getName().equals("") ) {
            throw new RuntimeException("Name cannot be empty!");  // Exception managed with RuntimeException.
        } else if(flowerDto.getCountry() == null ||  flowerDto.getCountry().equals("") ) {
            throw new RequestException("Country cannot be empty!");  // Exception managed with custom RequestException.
        }

        return new ResponseEntity<>(webClientFlowerService.createFlower(flowerDto), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Mono<FlowerDto>> updateFlower(@PathVariable int id, @RequestBody FlowerDto flowerDto) throws Exception {
        try {
            return new ResponseEntity<>(webClientFlowerService.updateFlower(id, flowerDto), HttpStatus.OK);
        } catch (RuntimeException ex) {
            throw new Exception("Internal server error", ex.getCause());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Mono<FlowerDto>> deleteFlower(@PathVariable int id) throws Exception {
        try {
            return new ResponseEntity<>(webClientFlowerService.deleteFlower(id), HttpStatus.OK);
        } catch (Exception ex) {
            throw new Exception("Internal server error", ex.getCause());
        }
    }


    // add
    // getById
    // delete
    // update

}
