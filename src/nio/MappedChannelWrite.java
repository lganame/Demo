package nio;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        //Obtain a channel to a file within a try-with-resources block.
       /* try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.READ,
                        StandardOpenOption.CREATE))
        //Then, map the file into a buffer
        MappedByteBuffer mBuf = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
        //Write some bytes to the buffer
        for (int i = 0; i < 26; i++) mBuf.put( byte)('A' + i)
        )

*/
    }
}
