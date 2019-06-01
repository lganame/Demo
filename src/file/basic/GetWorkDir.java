package file.basic;

import javax.swing.filechooser.FileSystemView;
import java.nio.file.FileSystem;

import static java.security.AccessController.getContext;

public class GetWorkDir {
    //on a desktop system
    public static void main(String[] args) {
        String path = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        /*
        //On android activity
        String path = new GetWorkDir.getApplicationInfo().dataDir;

        //On android fragment
        String path = getContext().getApplicationInfo().dataDir;
        */
    }
}
