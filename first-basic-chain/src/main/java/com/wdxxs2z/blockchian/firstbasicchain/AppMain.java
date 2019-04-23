package com.wdxxs2z.blockchian.firstbasicchain;

public class AppMain {

    public static void main(String[] args) {

        // 1. 创建第一个区块
        String[] message_1 = {"This is first block chain demo.","message code:0"};
        Block b1 = new Block(0, message_1);
        Integer b1Hash = b1.getBlockHash();

        // 2. 创建第二个区块
        String[] message_2 = {"This is second block chain demo.", "message hello:1"};
        Block b2 = new Block(b1Hash, message_2);
        Integer b2Hash = b2.getBlockHash();

        // 3. 创建第三个区块
        String[] message_3 = {"This is third block chain demo.", "message third: 2"};
        Block b3 = new Block(b2Hash, message_3);
        Integer b3Hash = b3.getBlockHash();

        System.out.println("第一块区块的hash：" + b1Hash);
        System.out.println("第二块区块的hash：" + b2Hash);
        System.out.println("第三块区块的hash：" + b3Hash);
    }
}
