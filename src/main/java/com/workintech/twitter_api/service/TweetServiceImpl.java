package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dao.TweetRepository;
import com.workintech.twitter_api.dto.TweetDTO;
import com.workintech.twitter_api.dto.TweetResponseDTO;
import com.workintech.twitter_api.entity.Tweet;
import com.workintech.twitter_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetServiceImpl implements TweetService{

    private TweetRepository repository;

    @Autowired
    public TweetServiceImpl(TweetRepository repository) {
        this.repository = repository;
    }

    @Override
    public TweetResponseDTO save(TweetDTO dto) {
        TweetResponseDTO tweetResponseDTO = new TweetResponseDTO();
        User user = new User();
        user.setId(dto.getUserId());
        Tweet tweet = new Tweet();
        tweet.setUser(user);
        tweet.setContent(dto.getContent());
        tweet.setCreateDate(dto.getCreateDate());
        tweet.setUpdateDate(dto.getUpdateDate());
        Tweet insertedTweet = repository.save(tweet);
        tweetResponseDTO.setTweetId(insertedTweet.getId());
        tweetResponseDTO.setSuccess(true);
        return tweetResponseDTO;
    }



}
