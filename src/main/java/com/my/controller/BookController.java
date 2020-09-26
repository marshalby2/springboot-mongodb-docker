package com.my.controller;

import com.my.bean.Book;
import com.my.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 24/9/20 7:46 PM
 */
@RestController
@RequestMapping("/book")
@Api(value = "书籍管理", tags = "book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    @ApiOperation(value = "保存")
    public void save(@RequestBody Book book) {
        this.bookService.save(book);
    }

    @GetMapping("/getById/{id}")
    @ApiOperation(value = "根据ID查询")
    public Book getById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    @GetMapping("/getByName/{name}")
    @ApiOperation(value = "根据名称查询")
    public Book getByName(@PathVariable String name) {
        return bookService.findByName(name);
    }


    @GetMapping("/getAll")
    @ApiOperation(value = "查询所有")
    public List<Book> getAll() {
        return bookService.findAll();
    }


    @PutMapping("/update")
    @ApiOperation(value = "更新")
    public void update(@RequestBody Book book) {
        bookService.update(book);
    }

    @DeleteMapping("/delete{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Integer id) {
        bookService.delete(id);
    }
}
