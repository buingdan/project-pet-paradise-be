package com.example.projectpetparadisebe.payload.comment;

import com.example.projectpetparadisebe.enums.CommentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentAdminUpdate {
    private Integer id;
    private String content;
    private Integer vote;
    private LocalDateTime timeCreated;
    private CommentStatus commentStatus;
    private Integer accountId;

    private Integer productId;

    private Boolean isActive;
}
