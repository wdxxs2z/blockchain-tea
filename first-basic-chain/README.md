## first-basic-chain

最简单的区块链对象,可创建三个区块对象，修改其中一个值，对后续的整条链路都有影响

```
/**
 * 记录前一个块的hash值
 * */
private Integer prevHash;

/**
 * 区块的内容，即传递的信息
 * */
private String[] transactionMessage;
/**
 *  当前块的hash值
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
```