package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.service;



import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.dto.FlowerDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WebClientFlowerService {

    public Flux<FlowerDto> getAllFlowers();
    public Mono<FlowerDto> getFlowerById(int id);
    Mono<FlowerDto> createFlower(FlowerDto flowerDto);
    Mono<FlowerDto> updateFlower(int id, FlowerDto flowerDto);
    Mono<FlowerDto> deleteFlower(int id);


}
