package com.codingshuttle.SecurityApp.SecurityApplication.controllers;


import com.codingshuttle.SecurityApp.SecurityApplication.dto.PostDTO;
import com.codingshuttle.SecurityApp.SecurityApplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    //@GetMapping(path = "/get-all-post")
    @GetMapping
    public List<PostDTO> getAllPost()
    {
        return postService.getAllPost();
    }

    @GetMapping(path = "/{postId}")
    public PostDTO getPostById(@PathVariable Long postId)
    {
        return postService.getPostById(postId);
    }

    @PostMapping(path = "/create-new-post")
    public PostDTO createNewPost(@RequestBody PostDTO inputPost)
    {
        return postService.createNewPost(inputPost);
    }

   /* @PutMapping(path = "update-post/{postId}")
    public PostDTO updatePost(@RequestBody PostDTO inputPost,
                              @PathVariable Long postId)
    {
        return postService.updatePost(inputPost,postId);
    }
*/


}
