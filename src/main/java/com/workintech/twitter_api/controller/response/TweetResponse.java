package com.workintech.twitter_api.controller.response;

import com.workintech.twitter_api.dto.TweetResponseDTO;

public class TweetResponse {

    private TweetResponseDTO tweetDTO;

    public TweetResponse(TweetResponseDTO tweetDTO) {
        this.tweetDTO = tweetDTO;
    }

    public TweetResponse() {
    }

    public TweetResponseDTO getTweetDTO() {
        return tweetDTO;
    }

    public void setTweetDTO(TweetResponseDTO tweetDTO) {
        this.tweetDTO = tweetDTO;
    }
}
