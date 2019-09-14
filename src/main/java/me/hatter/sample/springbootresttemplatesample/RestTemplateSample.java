package me.hatter.sample.springbootresttemplatesample;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class RestTemplateSample {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .build();

        IpResponse ipr = restTemplate.getForObject("https://hatter.ink/ip/ip.jsonp", IpResponse.class);

        System.out.println(JSON.toJSONString(ipr, true));
    }
}
