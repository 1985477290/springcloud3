package com.xu.customer.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@FeignClient(value = "PRODUCER", fallback = AccountFeignHysteric.class)
public interface AccountFeign {

    @RequestMapping(value = "/account/selectAllAccount", method= RequestMethod.GET)
    public  String selectAllAccount(@RequestParam("id") Integer id);

    @GetMapping(value = "/account/selectAllAccount/{id}")
    public  String selectAllAccount2(@PathVariable(value = "id") Integer id);

}
