/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:4/17/2023
 * Time:5:57 PM
 * Project Name:spring-boot-docker
 */
package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
}
