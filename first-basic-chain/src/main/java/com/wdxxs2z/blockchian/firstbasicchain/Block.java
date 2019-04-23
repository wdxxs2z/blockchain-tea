package com.wdxxs2z.blockchian.firstbasicchain;

import java.util.Arrays;

public class Block {

    /**
     * 记录前一个块的hash值
     * */
    private Integer prevHash;

    /**
     * 区块的内容，即传递的信息
     * */
    private String[] transactionMessage;

    /**
     * 当前块的hash值
     * */
    private Integer blockHash;

    public Block(Integer prevHash, String[] transactionMessage) {
        this.prevHash = prevHash;
        this.transactionMessage = transactionMessage;

        // 将前驱的块hash和当前的内容取hash一同放到内容的链中
        Object[] contents = {Arrays.hashCode(transactionMessage), prevHash};
        // 对包含前驱和当前传输信息的hash对象再次hash
        this.blockHash = Arrays.hashCode(contents);
    }

    public Integer getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(Integer prevHash) {
        this.prevHash = prevHash;
    }

    public String[] getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String[] transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public Integer getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(Integer blockHash) {
        this.blockHash = blockHash;
    }
}
