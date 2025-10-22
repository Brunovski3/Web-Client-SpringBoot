package com.api.externa.web.service;

import com.api.externa.web.dto.PostDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostsService {

    private final WebClient webClient;

    public PostsService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<PostDTO> save(PostDTO postDTO){
        return webClient.post().uri("/posts").bodyValue(postDTO).retrieve().bodyToMono(PostDTO.class);
    }
    public Flux<PostDTO> getPosts(){
        return webClient.get().uri("/posts").retrieve().bodyToFlux(PostDTO.class);
    }

    public Flux<PostDTO> getPostsByUser(Integer userId){
        return webClient.get().uri("/users/"+userId+"/posts").retrieve().bodyToFlux(PostDTO.class);
    }

    public Mono<PostDTO> update(Integer id, PostDTO postDTO){
        return webClient.put().uri("/posts/"+id).bodyValue(postDTO).retrieve().bodyToMono(PostDTO.class);
    }
    public Mono<Void> delete(Integer id){
         return webClient.delete().uri("/posts/" + id).retrieve().bodyToMono(Void.class);
    }
}
