package com.workintech.twitter_api.controller.request;

import com.workintech.twitter_api.dto.TweetDTO;

public class TweetRequest {

    private TweetDTO tweetDTO;

    public TweetRequest(TweetDTO tweetDTO) {
        this.tweetDTO = tweetDTO;
    }

    public TweetDTO getTweetDTO() {
        return tweetDTO;
    }

    public void setTweetDTO(TweetDTO tweetDTO) {
        this.tweetDTO = tweetDTO;
    }
}
