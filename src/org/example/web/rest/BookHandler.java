package org.example.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class BookHandler {

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String getBook(@PathVariable("id") String bookId) {
        System.out.println("bookId: " + bookId);
        return "success";
    }

    @PostMapping("/book")
    public String postBook(String bookName) {
        System.out.println("bookName: " + bookName);
        return "success";
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") String bookId) {
        System.out.println("delete bookId: " + bookId);
        // return "success"; // [ 如果这样返回会报错 JSPs only permit GET POST or HEAD]
        return "redirect:/user/success";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @PutMapping("/book/{id}")
    public String putBook(@PathVariable("id") String bookId) {
        System.out.println("put bookId: " + bookId);
        return "redirect:/user/success";
    }

}
