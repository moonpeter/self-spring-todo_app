package com.totolist.MySpringApp.ToDoitem;

import lombok.*;

@Getter @Setter
@Builder
public class ToDoItemRequest {

    private String id;
    private String title;
    private boolean done;

}
