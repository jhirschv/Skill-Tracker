package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello(){
        return "<html>" +
                "<body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ul>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "</ul>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String formPage(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "Name: <input type='text' name='name' /><br>" +
                "Favorite Language: <select name='favorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select><br>" +
                "Second Favorite: <select name='secondFavorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select><br>" +
                "Third Favorite: <select name='thirdFavorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String finalPage(@RequestParam String name, String favorite, String secondFavorite, String thirdFavorite){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }



}
