package com.hashedin.hu22;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Hu22Application.class}, loader = AnnotationConfigContextLoader.class)
//@Transactional
public class Hu22ApplicationTests {

//    @Autowired
//    private DemoRepository demoRepository;
//
//    @Before
//    public void initialize() {
//    }
//
//    @Test
//    public void insertDemoEntry() {
//        Demo demo = new Demo(1, "Linker");
//        demoRepository.save(demo);
//
//        Optional<Demo> byId = demoRepository.findById(1L);
//        Assertions.assertTrue(byId.isPresent(), "Entity is not saved");
//
//        Demo demoFromRepo = byId.get();
//        Assertions.assertEquals(demo.getName(), demoFromRepo.getName(), "Entity's name is different");
//    }
}
