package com.api.externa.web.controller;

import com.api.externa.web.dto.PostDTO;
import com.api.externa.web.service.PostsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private final PostsService postsService;

    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }
    @PostMapping
    public ResponseEntity<Mono<PostDTO>> save(@RequestBody PostDTO postDTO){
        return new ResponseEntity<>(postsService.save(postDTO), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Flux<PostDTO>> getPosts(){
        return new ResponseEntity<>(postsService.getPosts(), HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<Flux<PostDTO>> getPosts(@PathVariable Integer userId){
        return new ResponseEntity<>(postsService.getPostsByUser(userId), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Mono<PostDTO>> update(@PathVariable Integer id, @RequestBody PostDTO postDTO){
        return new ResponseEntity<>(postsService.update(id, postDTO), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        postsService.delete(id);
        return new ResponseEntity<>("Post deleted successfully", HttpStatus.OK);
    }


}