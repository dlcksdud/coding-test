package com.code.test.vo;

import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Board {
    private Integer num;
    private String title;
    private String Content;
    private String createDate;
    private String modifyDate;
}
