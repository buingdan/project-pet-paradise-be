package com.example.projectpetparadisebe.payload.comment;

import com.example.projectpetparadisebe.enums.CommentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentAdminDTO {
    private Integer id;
    private String content;
    private Integer vote;
    //    private LocalDateTime timeCreated;
    private CommentStatus commentStatus;
//    private Integer accountId;
//
//    private Integer productId;

    private Boolean isActive;
}
