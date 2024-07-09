interface Image {
    void display();
}
class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
        downloadImage();
    }

    private void downloadImage() {
        System.out.println("Downloading image from " + url);
        // Simulate download delay
        try {
            Thread.sleep(2000); // 2 seconds delay to simulate download
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image downloaded from " + url);
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + url);
    }
}
class ProxyImage implements Image {
    private RealImage realImage;
    private String url;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.display();
    }
}
