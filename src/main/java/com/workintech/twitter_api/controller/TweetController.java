package com.workintech.twitter_api.controller;


import com.workintech.twitter_api.controller.request.TweetRequest;
import com.workintech.twitter_api.controller.response.TweetResponse;
import com.workintech.twitter_api.dto.TweetResponseDTO;
import com.workintech.twitter_api.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweet")
public class TweetController {

    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PostMapping("/save")
    public TweetResponse saveTweet(@RequestBody TweetRequest request){
        TweetResponse response = new TweetResponse();
        TweetResponseDTO dto = tweetService.save(request.getTweetDTO());
        response.setTweetDTO(dto);
        return response;
    }
}
