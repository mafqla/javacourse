package com.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 照片(Photo)表控制层
 *
 * @author fuqianlin
 * @since 2022-01-16 19:19:42
 */
@Api(tags = "照片(Photo)") 
@Validated
@RestController
@RequestMapping("photo")
public class PhotoController {


}
