package cn.itcast.netty.c1;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//日志记录器
@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) throws FileNotFoundException {
        //FileChannel
        //1、输入输出流，2、RandomAccessFile
        try (FileChannel channel = new FileInputStream("F:\\test\\Netty_codes\\netty_demo\\data.txt").getChannel()){
            //准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(20);
            while (true) {
                //从channel读取数据，向buffer写入
                int len = channel.read(buffer);
                log.debug("读取到的字节数{}", len);
                if (len == -1){//没有内容了
                    break;
                }
                //打印buffer的内容
                buffer.flip();//切换到读模式
                while (buffer.hasRemaining()) {
                    byte b = buffer.get();
                    log.debug("读取到的字节{}", (char) b);
                }
                buffer.clear();//切换为写模式
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
