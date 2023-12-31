package com.example.projectpetparadisebe.payload.response;

import com.example.projectpetparadisebe.enums.CommentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Integer id;
    private String content;
    private LocalDateTime timeCreated;
    private CommentStatus commentStatus;

}
