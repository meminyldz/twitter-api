package com.workintech.twitter_api.dto;

public class TweetResponseDTO {
    private Long tweetId;
    private Boolean isSuccess;

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }
}
