/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:4/17/2023
 * Time:5:58 PM
 * Project Name:spring-boot-docker
 */
package com.example.domain.template;

import lombok.Data;

@Data
public class UserRequest {
    private String firstname;
    private String lastname;
    private String username;
}
