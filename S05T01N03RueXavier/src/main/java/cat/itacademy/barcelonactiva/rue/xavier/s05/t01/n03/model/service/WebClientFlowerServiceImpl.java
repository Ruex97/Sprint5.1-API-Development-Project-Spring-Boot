package cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.service;


import cat.itacademy.barcelonactiva.rue.xavier.s05.t01.n03.model.dto.FlowerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WebClientFlowerServiceImpl implements WebClientFlowerService {


    private final WebClient webClient;

    @Autowired
    public WebClientFlowerServiceImpl (WebClient webClient) {
        this.webClient = webClient;
    }



    @Override
    public Flux<FlowerDto> getAllFlowers() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/getAll").build())
                .retrieve()
                .bodyToFlux(FlowerDto.class);
    }

    @Override
    public Mono<FlowerDto> getFlowerById(int id) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/getOne/{id}").build(id))
                .retrieve()
                .bodyToMono(FlowerDto.class);
    }

    @Override
    public Mono<FlowerDto> createFlower(FlowerDto flowerDto) {
        return webClient.post()
                .uri(uriBuilder -> uriBuilder.path("/add").build())
                .bodyValue(flowerDto)
                .retrieve()
                .bodyToMono(FlowerDto.class);
    }

    @Override
    public Mono<FlowerDto> updateFlower(int id, FlowerDto flowerDto) {
        return webClient.put()
                .uri(uriBuilder -> uriBuilder.path("/update/{id}").build(id))
                .bodyValue(flowerDto)
                .retrieve()
                .bodyToMono(FlowerDto.class);
    }

    @Override
    public Mono<FlowerDto> deleteFlower(int id) {
        return webClient.delete()
                .uri(uriBuilder -> uriBuilder.path("/delete/{id}").build(id))
                .retrieve()
                .bodyToMono(FlowerDto.class);
    }


}
