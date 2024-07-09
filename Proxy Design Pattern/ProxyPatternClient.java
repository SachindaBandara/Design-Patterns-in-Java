public class ProxyPatternClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("http://example.com/test_image.jpg");

        // Image will be downloaded from the internet and displayed
        image.display();
        System.out.println("");

        // Image will not be downloaded again, it will be displayed directly
        image.display();
    }
}
