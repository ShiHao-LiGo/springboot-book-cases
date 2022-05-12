package cn.itcast.netty.c1;

import java.nio.ByteBuffer;

import static cn.itcast.netty.c1.ByteBufferUtil.debugAll;

public class TestByteBufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x61);
        debugAll(buffer);
        buffer.put(new byte[] {0x62,0x63,0x64});//b c d
        debugAll(buffer);

        buffer.flip();//切换为读模式
        System.out.println(buffer.get());
        debugAll(buffer);
        buffer.compact();
        debugAll(buffer);

        buffer.put(new byte[] {0x65,0x66,0x68});//b c d
        debugAll(buffer);
    }
}
