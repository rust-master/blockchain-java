
import java.util.Arrays;
public class Blockchain {
    public static void main(String[] args){
    
        Transaction t1 = new Transaction("Zaryab", "Amir", 100L);
        Transaction t2 = new Transaction("Raza", "Ali", 50L);
        Transaction t3 = new Transaction("Raza", "Ali", 50L);
        Transaction t4 = new Transaction("Ali", "Ahmad", 50L);
        Transaction t5 = new Transaction("Ali", "Ahmad", 50L);

        Block genesisBlock = new Block(0, Arrays.asList(t1, t2));
        System.out.println(genesisBlock.hashCode());
        Block secondBlock = new Block(genesisBlock.hashCode(), Arrays.asList(t3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(t4));
        System.out.println(thirdBlock.hashCode());
        Block fourthBlock = new Block(thirdBlock.hashCode(), Arrays.asList(t5));
        System.out.println(fourthBlock.hashCode());
    }
}