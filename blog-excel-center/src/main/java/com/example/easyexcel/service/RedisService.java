package com.example.easyexcel.service;

import com.example.easyexcel.entity.LikedCountDTO;
import com.example.easyexcel.model.UserLike;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * redis操作点赞服务
 * <p>
 *
 * @author zhenhuaxiang
 * @since 2021-02-08
 */
public interface RedisService {
    /**
     * 点赞。状态为1
     * @param likedUserId
     * @param likedPostId
     */
    void saveLiked2Redis(String likedUserId, String likedPostId);
    /**
     * 取消点赞。将状态改变为0
     * @param likedUserId
     * @param likedPostId
     */
    void unlikeFromRedis(String likedUserId, String likedPostId);
    /**
     * 从Redis中删除一条点赞数据
     * @param likedUserId
     * @param likedPostId
     */
    void deleteLikedFromRedis(String likedUserId, String likedPostId);
    /**
     * 该用户的点赞数加1
     * @param likedUserId
     */
    void incrementLikedCount(String likedUserId);
    /**
     * 该用户的点赞数减1
     * @param likedUserId
     */
    void decrementLikedCount(String likedUserId);
    /**
     * 获取Redis中存储的所有点赞数据
     * @return
     */
    List<UserLike> getLikedDataFromRedis();
    /**
     * 获取Redis中存储的所有点赞数量
     * @return
     */
    List<LikedCountDTO> getLikedCountFromRedis();
}
