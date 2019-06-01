package patterns.Structural;

//Subject
abstract class Graphic_2 {
    protected String fileName;

    abstract void draw();

    public String getFileName() {
        return fileName;
    }
}

//RealSubject
class Image_2 extends Graphic_2 {
    public Image_2(String fileName) {
        this.fileName = fileName;
    }

    //Request()
    public void draw() {
        System.out.println("draw" + fileName);
    }
}

//Proxy
class ImageProxy extends Graphic_2{
    private Image_2 image;
    public ImageProxy(String fileName){
        this.fileName = fileName;
    }
    public void draw(){
        getImage().draw();
    }
    private Image_2 getImage(){
        if(image == null){
            image = new Image_2(fileName);
        }
        return image;
    }
}


public class ProxyDemo {
    public static void main(String[] args) {
        ImageProxy proxy = new ImageProxy("1.png");
        String fileName = proxy.getFileName();
        //forwarded to the RealSubject
        proxy.draw();
    }
}

