package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(MybatisBootDemoApplication::class))
@WebAppConfiguration
class MybatisBootDemoApplicationTests {
  //ע��
  //ע��3
  //ע��1
  //ע��2
  @Test
  fun contextLoads() {
    assert(1 + 2 == 3)
  }

}
