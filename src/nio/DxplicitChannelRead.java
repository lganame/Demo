            package nio;

            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.nio.channels.SeekableByteChannel;
            import java.nio.file.Files;
            import java.nio.file.InvalidPathException;
            import java.nio.file.Path;
            import java.nio.file.Paths;

            public class DxplicitChannelRead {
                public static void main(String[] args) {
                    int count;
                    Path filepath = null;
                    //First obtain a path to the file.
                    try {
                        filepath = Paths.get("test.txt");
                    } catch (InvalidPathException e) {
                        System.out.println("Path Error" + e);
                        e.printStackTrace();
                        return;
                    }

                    //Next,obtain a channel to that file with in a try-with-resources block
                    try(SeekableByteChannel fChan = Files.newByteChannel(filepath))
                    {
                        //Allocate a buffer.
                        ByteBuffer mBuf = ByteBuffer.allocate(128);
                        do {
                            //Read a buffer.
                            count = fChan.read(mBuf);
                            //Stop when end of life is reached.
                            if (count != -1) {
                                //Rewind the buffer so that it can be read.
                                mBuf.rewind();

                                //Read bytes from the buffer and show them on ther screen as characters
                                for (int i = 0; i < count; i++) {
                                    System.out.println((char) mBuf.get());
                                }
                            }
                        } while (count != -1);
                        System.out.println();
                    }catch(IOException e)
                    {
                        System.out.println("I/O Error " + e);
                    }
                }
                    }
