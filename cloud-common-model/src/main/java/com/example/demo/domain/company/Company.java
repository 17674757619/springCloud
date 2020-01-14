package com.example.demo.domain.company;

import lombok.Data;

@Data
public class Company {
    private String id;
    private String name;

    public static void main(String[] args) {
        Company company=new Company();
         company.id="43243";
         company.name="rq4432";
        System.out.println(company.id);
    }
}
