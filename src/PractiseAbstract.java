import com.jl.javabase.AbstractTest;
import com.jl.javabase.ExtendsTest;
import com.jl.javabase.Son;

import java.nio.channels.ServerSocketChannel;

/**
 * @ClassName PractiseAbstract
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/28 10:58
 * @Version 1.0
 */
public class PractiseAbstract {
    public static void main(String[] args){
        ExtendsTest abstractTest = new ExtendsTest();
        new Son<AbstractTest>() {
            @Override
            public AbstractTest run() {
                return null;
            }
        };
        abstractTest.run();
        System.out.println("dasdfef");
    }
}
